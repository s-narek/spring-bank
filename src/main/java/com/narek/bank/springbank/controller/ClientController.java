package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.model.dto.TransferBalanceDto;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService getBalanceClient;

    @GetMapping("/balance")
    public ResponseEntity<BigDecimal> getBalance(@ModelAttribute TransferBalanceDto from) {
        return ResponseEntity.ok(getBalanceClient.getBalance(from.getFrom()));
    }
}
