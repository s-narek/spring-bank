package com.narek.bank.springbank.model.response;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@Jacksonized
@RequiredArgsConstructor
public class AccountDto {
    /**
     * Account id.
     */
    private final UUID id;

    /**
     * Account number.
     */
    private final Long number;

    /**
     * Account balance.
     */
    private final BigDecimal balance;

    /**
     * Foreign key.
     */
    private final UUID clientId;
}
