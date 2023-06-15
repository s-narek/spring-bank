package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.model.entity.Client;
import com.narek.bank.springbank.repository.ClientRepository;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    /**
     * Class to work with DB client.
     */
    private final ClientRepository clientRepository;

    /**
     * Method to get client's information.
     *
     * @param id - client's id
     * @return client's information
     */
    @Override
    public Client getInformation(final Long id) {
        var client = clientRepository.findById(id);
        if (client.isPresent()) {
            return client.get();
        } else {
            throw new UnsupportedOperationException("Client not found");
        }
    }
}
