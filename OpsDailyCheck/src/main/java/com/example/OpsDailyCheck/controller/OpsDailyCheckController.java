package com.example.OpsDailyCheck.controller;

import com.example.OpsDailyCheck.dto.OpsDailyCheckDto;
import com.example.OpsDailyCheck.service.interfaces.OpsDailyCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.util.List;

@RestController
@RequestMapping("/ops-daily-checks")
@CrossOrigin(origins = "*")
public class OpsDailyCheckController {

    @Autowired
    private final OpsDailyCheckService opsDailyCheckService;


    public OpsDailyCheckController(OpsDailyCheckService opsDailyCheckService) {
        this.opsDailyCheckService = opsDailyCheckService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<OpsDailyCheckDto>> getAllOpsDailyChecks() {
        List<OpsDailyCheckDto> opsDailyChecks = opsDailyCheckService.getAllOpsDailyChecks();
        return ResponseEntity.ok(opsDailyChecks);
    }

    @GetMapping("/getByDate")
    public ResponseEntity<OpsDailyCheckDto> getOpsDailyCheckByDateOfEntry(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime updatedAt) {
        OpsDailyCheckDto opsDailyCheck = opsDailyCheckService.getOpsDailyCheckByDateOfEntry(updatedAt);
        if (opsDailyCheck != null) {
            return ResponseEntity.ok(opsDailyCheck);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/create")
    public ResponseEntity<OpsDailyCheckDto> createOpsDailyCheck(@RequestBody OpsDailyCheckDto opsDailyCheckDto) {
        // Get the current date and time
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate);

        // Get the string representation of the current date and time
        String currentDateTimeString = currentDate.toString();
        System.out.println(currentDateTimeString);

        // Slice the string up to 'T'
        String currentDatePart = currentDateTimeString.substring(0, currentDateTimeString.indexOf('T'));
        System.out.println(currentDatePart);

        // Compare the sliced date with the current date
        if (currentDatePart.equals(opsDailyCheckDto.getCreatedAt())) {
            // If the dates match, it means a checklist already exists for today
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        // Set the createdAt timestamp to the current date and time
        LocalDateTime now = LocalDateTime.now();
        opsDailyCheckDto.setCreatedAt(now);

        // Assuming status is set based on some logic
        // opsDailyCheckDto.setStatus(true);

        // Create the checklist
        OpsDailyCheckDto createdOpsDailyCheck = opsDailyCheckService.createOpsDailyCheck(opsDailyCheckDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOpsDailyCheck);
    }




}
