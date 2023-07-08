package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.model.response.ClientDto;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public final class ClientController {

    /**
     * Class for working with a client account.
     */
    private final ClientService clientService;

    /**
     * Get controller to receive the client's information.
     * @param id - client's id.
     * @return client's information.
     */
    @GetMapping("/clients/{id}")
    public ResponseEntity<ClientDto> getClient(@PathVariable final UUID id) {
        return ResponseEntity.ok(clientService.get(id));
    }
}
