package com.narek.bank.springbank.service;

import com.narek.bank.springbank.model.response.ClientDto;

import java.util.UUID;

public interface ClientService {
    /**
     * Get client's information.
     * @param id - id of client
     * @return client's information
     */
    ClientDto get(UUID id);
}
