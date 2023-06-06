package com.narek.bank.springbank.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferBalanceDto {
    private final Long from;
    private final Long to;
    private final BigDecimal amount;
}
