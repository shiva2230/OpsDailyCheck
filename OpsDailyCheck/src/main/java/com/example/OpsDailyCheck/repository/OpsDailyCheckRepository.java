package com.example.OpsDailyCheck.repository;

import com.example.OpsDailyCheck.dto.OpsDailyCheckDto;
import com.example.OpsDailyCheck.entity.OpsDailyCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository

public interface OpsDailyCheckRepository extends JpaRepository<OpsDailyCheck,Long> {

    OpsDailyCheck findByUpdatedAtAfter(LocalDateTime updatedAt);

    boolean existsByUpdatedAt(LocalDate date);
}
