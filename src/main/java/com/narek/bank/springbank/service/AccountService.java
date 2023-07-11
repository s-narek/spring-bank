package com.narek.bank.springbank.service;

import com.narek.bank.springbank.model.response.AccountDto;

public interface AccountService {
    /**
     * Add client's account.
     * @param accountDto - accountDto
     * @return accountDto
     */
    AccountDto put(AccountDto accountDto);
}
