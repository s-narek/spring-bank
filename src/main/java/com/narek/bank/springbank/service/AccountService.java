package com.narek.bank.springbank.service;

import com.narek.bank.springbank.model.entity.Account;

public interface AccountService {
    /**
     * Add client's account.
     * @param account - account
     * @return accountDto
     */
    Account create(Account account);
}
