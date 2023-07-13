package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.model.entity.Account;
import com.narek.bank.springbank.repository.AccountRepository;
import com.narek.bank.springbank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    /**
     * Account number length.
     */
    private static final long ACCOUNT_NUMBER_LENGTH = 1000000000;

    /**
     * Class to work with DB account.
     */
    private final AccountRepository accountRepository;

    /**
     * Add client's account.
     * @param account - account
     * @return accountDto
     */
    @Override
    @Transactional
    public Account create(final Account account) {
        var number = (long) (Math.random() * ACCOUNT_NUMBER_LENGTH);
        account.setNumber(number);
        return accountRepository.save(account);
    }
}
