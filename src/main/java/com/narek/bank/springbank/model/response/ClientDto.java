package com.narek.bank.springbank.model.response;

import com.narek.bank.springbank.model.entity.Account;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class ClientDto extends BaseClientDto {
    /**
     * Client's id.
     */
    private final UUID id;

    /**
     * Client's account.
     */
    private final List<Account> account;
}
