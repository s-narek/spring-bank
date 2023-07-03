package com.narek.bank.springbank.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MoneyTransferRequestDto {
    /**
     * Money's sender.
     */
    private final Long sender;
    /**
     * Money's recipient.
     */
    private final Long recipient;
    /**
     * Amount of money to transfer from sender's balance to recipient's balance.
     */
    private final BigDecimal amount;
}
