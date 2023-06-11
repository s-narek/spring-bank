package com.narek.bank.springbank.model.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferBalanceDto {
    /**
     * Who will send money.
     */
    private final Long clientTransfersMoney;
    /**
     * Who to send money.
     */
    private final Long clientReceivesMoney;
    /**
     * How much money to send.
     */
    private final BigDecimal amountMoney;
}
