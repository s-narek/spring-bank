package com.narek.bank.springbank.controller;

import com.narek.bank.springbank.mapper.ClientMapper;
import com.narek.bank.springbank.model.response.ClientDto;
import com.narek.bank.springbank.model.response.CreateClientDto;
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
    @GetMapping("/client/{id}")
    public ResponseEntity<ClientDto> getClient(@PathVariable final UUID id) {
        return ResponseEntity.ok(clientService.get(id));
    }

    /**
     * API to return a list of all clients.
     * @return All clients
     */
    @GetMapping("/client")
    public ResponseEntity<List<ClientDto>> getAllClient() {
        return ResponseEntity.ok(clientService.getAll());
    }

    /**
     * Post controller to put client's information.
     * @param clientDto - Client's information
     * @return Client's information
     */
    @PostMapping("/client/add")
    public ResponseEntity<CreateClientDto> addClient(@RequestBody final ClientDto clientDto) {
        var client = clientService.create(ClientMapper.INSTANCE.map(clientDto));
        var createClientDto = ClientMapper.INSTANCE.mapClientToCreateClientDto(client);
        return ResponseEntity.ok(createClientDto);
    }
}
