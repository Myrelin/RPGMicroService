package com.codecool.rpggame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DiceRollResult {
    private int result;
    private String dice;
    private String port;
}
