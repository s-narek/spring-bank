package com.narek.bank.springbank.service;

import com.narek.bank.springbank.model.entity.Client;
import com.narek.bank.springbank.model.response.ClientDto;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.UUID;

public interface ClientService {
    /**
     * Get client's information.
     * @param id - id of client
     * @return client's information
     */
    ClientDto get(UUID id);

    /**
     * Get all client's information.
     * @param pageRequest - number of pages and limit per page
     * @return all client's information
     */
    List<ClientDto> getAll(PageRequest pageRequest);

    /**
     * Add client's information.
     * @param client - client
     * @return client
     */
    Client create(Client client);
}
