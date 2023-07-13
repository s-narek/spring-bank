package com.narek.bank.springbank.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor(force = true)
public abstract class BaseAccountDto {
    /**
     * Account number.
     */
    private Long number;

    /**
     * Account balance.
     */
    private BigDecimal balance;
}
