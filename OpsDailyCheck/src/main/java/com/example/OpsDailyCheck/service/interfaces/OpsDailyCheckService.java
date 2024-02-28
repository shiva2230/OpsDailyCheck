package com.example.OpsDailyCheck.service.interfaces;

import com.example.OpsDailyCheck.dto.OpsDailyCheckDto;
import com.example.OpsDailyCheck.entity.OpsDailyCheck;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface OpsDailyCheckService {
    List<OpsDailyCheckDto> getAllOpsDailyChecks();
    OpsDailyCheckDto getOpsDailyCheckByDateOfEntry(LocalDateTime updatedAt);
    OpsDailyCheckDto createOpsDailyCheck(OpsDailyCheckDto opsDailyCheckDto);

    boolean existsOpsDailyCheckForDate(LocalDateTime date);
}
