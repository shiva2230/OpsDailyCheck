package com.example.OpsDailyCheck.dto;

import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OpsDailyCheckDto {

    private Long id;
    private Boolean planetTimeCheck;
    private Boolean fishPlanetProductCheck;
    private Boolean offerValidityCheck;
    private Boolean deliveryPartnerCheck;
    private Boolean orderCheck;
    private Boolean merchantDelayCheck;
    private Boolean deliveryDelayCheck;
    private String comment;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
}
