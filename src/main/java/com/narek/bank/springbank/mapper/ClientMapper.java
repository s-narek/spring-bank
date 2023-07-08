package com.narek.bank.springbank.mapper;

import com.narek.bank.springbank.model.entity.Client;
import com.narek.bank.springbank.model.response.ClientDto;
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
}
