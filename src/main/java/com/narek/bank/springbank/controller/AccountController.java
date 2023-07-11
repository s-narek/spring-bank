package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.model.response.AccountDto;
import com.narek.bank.springbank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    /**
     * Class for working with a client account.
     */
    private final AccountService accountService;

    /**
     * Post controller to put client's account.
     * @param accountDto - client's account
     * @return client's account
     */
    @PostMapping("/clients/account")
    public ResponseEntity<AccountDto> put(@RequestBody final AccountDto accountDto) {
        return ResponseEntity.ok(accountService.put(accountDto));
    }
}
