package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.model.dto.TransferBalance;
import com.narek.bank.springbank.service.GetBalanceClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
public class BankController {

    private GetBalanceClient getBalanceClient;

    @GetMapping("/getBalance")
    public BigDecimal getBalance(@ModelAttribute TransferBalance from) {
        return getBalanceClient.getBalance(from.getFrom());
    }

}
