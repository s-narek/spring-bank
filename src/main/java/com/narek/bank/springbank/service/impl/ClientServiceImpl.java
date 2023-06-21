package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.mapper.ClientMapper;
import com.narek.bank.springbank.model.response.ClientDto;
import com.narek.bank.springbank.repository.ClientRepository;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

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
    @Transactional(readOnly = true)
    public ClientDto get(final UUID id) {
        var optionalClient = clientRepository.findById(id);
        return optionalClient
                .map(ClientMapper.INSTANCE::map)
                .orElseThrow(() -> new UnsupportedOperationException("Client not found"));
    }
}
