package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.repository.ClientRepository;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    @Override
    public BigDecimal getBalance(Long id) {
        var client = clientRepository.findById(id);
        if (client.isPresent()) {
            return client.get().getBalance();
        } else {
            throw new UnsupportedOperationException("Client not found");
        }
    }
}
