package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.mapper.AccountMapper;
import com.narek.bank.springbank.model.response.AccountDto;
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
     * @param accountDto - accountDto
     * @return accountDto
     */
    @Override
    @Transactional
    public AccountDto put(final AccountDto accountDto) {
        var account = AccountMapper.INSTANCE.map(accountDto);
        var number = (long) (Math.random() * ACCOUNT_NUMBER_LENGTH);
        account.setNumber(number);
        accountRepository.save(account);
        return AccountMapper.INSTANCE.map(account);
    }
}
