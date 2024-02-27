package com.example.OpsDailyCheck.mapper;

import com.example.OpsDailyCheck.dto.OpsDailyCheckDto;
import com.example.OpsDailyCheck.entity.OpsDailyCheck;

public class OpsDailyCheckMapper {

    public static OpsDailyCheckDto mapToOpsDailyCheckDto(OpsDailyCheck opsDailyCheck) {
        return new OpsDailyCheckDto(
                opsDailyCheck.getId(),
                opsDailyCheck.getPlanetTimeCheck(),
                opsDailyCheck.getFishPlanetProductCheck(),
                opsDailyCheck.getOfferValidityCheck(),
                opsDailyCheck.getDeliveryPartnerCheck(),
                opsDailyCheck.getOrderCheck(),
                opsDailyCheck.getMerchantDelayCheck(),
                opsDailyCheck.getDeliveryDelayCheck(),
                opsDailyCheck.getComment(),
                opsDailyCheck.getCreatedBy(),
                opsDailyCheck.getUpdatedBy(),
                opsDailyCheck.getUpdatedAt(),
                opsDailyCheck.getCreatedAt()
        );
    }

    public static OpsDailyCheck mapToOpsDailyCheck(OpsDailyCheckDto opsDailyCheckDto) {
        return new OpsDailyCheck(
                opsDailyCheckDto.getId(),
                opsDailyCheckDto.getPlanetTimeCheck(),
                opsDailyCheckDto.getFishPlanetProductCheck(),
                opsDailyCheckDto.getOfferValidityCheck(),
                opsDailyCheckDto.getDeliveryPartnerCheck(),
                opsDailyCheckDto.getOrderCheck(),
                opsDailyCheckDto.getMerchantDelayCheck(),
                opsDailyCheckDto.getDeliveryDelayCheck(),
                opsDailyCheckDto.getComment(),
                opsDailyCheckDto.getCreatedBy(),
                opsDailyCheckDto.getUpdatedBy(),
                opsDailyCheckDto.getUpdatedAt(),
                opsDailyCheckDto.getCreatedAt()
        );
    }
}
