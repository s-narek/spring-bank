package com.narek.bank.springbank.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MoneyTransferRequestDto {
    /**
     * Who will send money.
     */
    private final Long sender;
    /**
     * Who to send money.
     */
    private final Long recipient;
    /**
     * How much money to transfer from sender's balance to recipient's balance.
     */
    private final BigDecimal amount;
}
