package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.model.response.ClientDto;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
    public ResponseEntity<ClientDto> getAllClient(@PathVariable final UUID id) {
        return ResponseEntity.ok(clientService.get(id));
    }

    /**
     * Get controller to receive all client's.
     * @return All client's
     */
    @GetMapping("/clients")
    public ResponseEntity<List<ClientDto>> getAllClient() {
        return ResponseEntity.ok(clientService.getAll());
    }

    /**
     * Post controller to put client's information.
     * @param clientDto - Client's information
     * @return Client's information
     */
    @PostMapping("/clients/add")
    public ResponseEntity<ClientDto> addClient(@RequestBody final ClientDto clientDto) {
        return ResponseEntity.ok(clientService.put(clientDto));
    }
}
