package com.example.OpsDailyCheck.service.serviceImpl;

import com.example.OpsDailyCheck.dto.OpsDailyCheckDto;
import com.example.OpsDailyCheck.entity.OpsDailyCheck;
import com.example.OpsDailyCheck.mapper.OpsDailyCheckMapper;
import com.example.OpsDailyCheck.repository.OpsDailyCheckRepository;
import com.example.OpsDailyCheck.service.interfaces.OpsDailyCheckService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OpsDailyCheckServiceImpl implements OpsDailyCheckService {

    private final OpsDailyCheckRepository opsDailyCheckRepository;

    public OpsDailyCheckServiceImpl(OpsDailyCheckRepository opsDailyCheckRepository) {
        this.opsDailyCheckRepository = opsDailyCheckRepository;
    }

    public List<OpsDailyCheckDto> getAllOpsDailyChecks() {
        try {
            List<OpsDailyCheck> opsDailyChecks = opsDailyCheckRepository.findAll();
            return opsDailyChecks.stream().map(OpsDailyCheckMapper::mapToOpsDailyCheckDto).collect(Collectors.toList());
        } catch (Exception ex) {
            throw new RuntimeException("Failed to retrieve all ops daily checks", ex);
        }
    }

    public OpsDailyCheckDto getOpsDailyCheckByDateOfEntry(LocalDateTime updatedAt) {
        try {
            return OpsDailyCheckMapper.mapToOpsDailyCheckDto(opsDailyCheckRepository.findByUpdatedAtAfter(updatedAt));
        } catch (Exception ex) {
            throw new RuntimeException("Failed to retrieve ops daily check by date of entry: " + updatedAt, ex);
        }
    }

    public OpsDailyCheckDto createOpsDailyCheck(OpsDailyCheckDto opsDailyCheckDto) {
        try {
            OpsDailyCheck opsDailyCheck = OpsDailyCheckMapper.mapToOpsDailyCheck(opsDailyCheckDto);
            OpsDailyCheck savedOpsDailyCheck = opsDailyCheckRepository.save(opsDailyCheck);
            return OpsDailyCheckMapper.mapToOpsDailyCheckDto(savedOpsDailyCheck);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to create ops daily check", ex);
        }
    }

    @Override
    public boolean existsOpsDailyCheckForDate(LocalDate date) {
        return opsDailyCheckRepository.existsByUpdatedAt(date);
    }
}
