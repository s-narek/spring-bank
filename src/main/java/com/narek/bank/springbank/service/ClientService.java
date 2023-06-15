package com.narek.bank.springbank.service;

import com.narek.bank.springbank.model.entity.Client;

public interface ClientService {
    /**
     * Get client's information.
     * @param id - id of client
     * @return client's information
     */
    Client getInformation(Long id);
}
