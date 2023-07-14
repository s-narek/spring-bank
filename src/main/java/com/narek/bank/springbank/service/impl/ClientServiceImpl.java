package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.exception.NotFoundException;
import com.narek.bank.springbank.mapper.ClientMapper;
import com.narek.bank.springbank.model.entity.Client;
import com.narek.bank.springbank.model.response.ClientDto;
import com.narek.bank.springbank.repository.ClientRepository;
import com.narek.bank.springbank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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
                .orElseThrow(() -> new NotFoundException(Client.class, id));
    }

    /**
     * Get all clients.
     * @param pageRequest - number of pages and limit per page
     * @return all client's information
     */
    @Override
    @Transactional(readOnly = true)
    public List<ClientDto> getAll(final PageRequest pageRequest) {
        var optionalClient = clientRepository.findAllBy(pageRequest);
        return optionalClient
                .stream().map(ClientMapper.INSTANCE::map)
                .collect(Collectors.toList());
    }

    /**
     * Add client's information.
     * @param client - client
     * @return clientDto
     */
    @Override
    @Transactional(readOnly = true)
    public Client create(final Client client) {
        return clientRepository.save(client);
    }
}
