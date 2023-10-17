package com.trading.TradingUpFundationBackend.commons.domains.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseSolutionTradingDTO implements Serializable {
    private Integer id;
    private String comment;
    private String urlVideo;
    private Integer userId;
    private Integer exerciseId;
}
