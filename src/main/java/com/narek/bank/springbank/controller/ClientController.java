package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public final class     ClientController {

    /**
     * Class for working with a client account.
     */
    private final ClientService clientService;

    /**
     * Get controller to receive the client's balance.
     * @param idClient id clint's.
     * @return Money on the client's balance.
     */
    @GetMapping("/clients/{idClient}/balance")
    public ResponseEntity<BigDecimal> getBalanceClient(@PathVariable final Long idClient) {
        System.out.println("ok");
        return ResponseEntity.ok(clientService.getBalanceClient(idClient));
    }
}
