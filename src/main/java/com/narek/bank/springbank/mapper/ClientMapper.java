package com.narek.bank.springbank.mapper;

import com.narek.bank.springbank.model.entity.Client;
import com.narek.bank.springbank.model.response.ClientDto;
import com.narek.bank.springbank.model.response.CreateClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    /**
     * Gives clients access to the mapper implementation.
     */
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    /**
     * map entity to dto.
     * @param client - client's
     * @return ClientDto
     */
    ClientDto map(Client client);

    /**
     * Map dto to entity.
     * @param clientDto - ClientDto
     * @return client's
     */
    Client map(ClientDto clientDto);

    /**
     * Map entity to dto.
     * @param client - client's
     * @return clientDto
     */
    CreateClientDto mapClientToCreateClientDto(Client client);
}
