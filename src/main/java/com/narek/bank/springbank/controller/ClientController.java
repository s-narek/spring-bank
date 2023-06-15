package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.model.entity.Client;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public final class ClientController {

    /**
     * Class for working with a client account.
     */
    private final ClientService clientService;

    /**
     * Get controller to receive the client's information.
     * @param id - id clint's.
     * @return client's information.
     */
    @GetMapping("/clients/{id}/information")
    public ResponseEntity<Client> getInformationClient(@PathVariable final Long id) {
        return ResponseEntity.ok(clientService.getInformation(id));
    }
}
