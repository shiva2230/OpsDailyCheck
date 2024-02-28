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
        if (opsDailyCheck != null && opsDailyCheck.getId() != null) {
            return ResponseEntity.ok(opsDailyCheck);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PostMapping("/create")
    public ResponseEntity<OpsDailyCheckDto> createOpsDailyCheck(@RequestBody OpsDailyCheckDto opsDailyCheckDto) {
        LocalDate localDate = LocalDate.now();

        LocalDateTime currentDate = localDate.atStartOfDay();

        if (opsDailyCheckService.existsOpsDailyCheckForDate(currentDate)) {
            System.out.println("else condition");
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        LocalDateTime now = LocalDateTime.now();
        opsDailyCheckDto.setCreatedAt(now);
        opsDailyCheckDto.setUpdatedAt(now);

        OpsDailyCheckDto createdOpsDailyCheck = opsDailyCheckService.createOpsDailyCheck(opsDailyCheckDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOpsDailyCheck);
    }






}
