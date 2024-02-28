package com.example.OpsDailyCheck.repository;

import com.example.OpsDailyCheck.entity.OpsDailyCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface OpsDailyCheckRepository extends JpaRepository<OpsDailyCheck, Long> {

    boolean existsByCreatedAtBetween(LocalDateTime startOfDay, LocalDateTime endOfDay);

    OpsDailyCheck findByUpdatedAtAfter(LocalDateTime updatedAt);
}
