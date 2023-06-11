package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.repository.ClientRepository;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    /**
     * Class to work with DB client.
     */
    private final ClientRepository clientRepository;

    /**
     * Method to get client's balance.
     *
     * @param clientId id client
     * @return client's balance
     */
    @Override
    public BigDecimal getBalanceClient(final Long clientId) {
        var client = clientRepository.findById(clientId);
        if (client.isPresent()) {
            return client.get().getBalance();
        } else {
            throw new UnsupportedOperationException("Client not found");
        }
    }
}
