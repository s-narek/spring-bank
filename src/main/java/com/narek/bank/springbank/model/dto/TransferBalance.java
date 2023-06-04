package com.narek.bank.springbank.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferBalance {
    private Long from;
    private Long to;
    private BigDecimal amount;
}
