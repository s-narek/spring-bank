package com.narek.bank.springbank.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class AccountDto extends BaseAccountDto {
    /**
     * Account id.
     */
    private final UUID id;

    /**
     * Foreign key.
     */
    private final UUID clientId;
}
