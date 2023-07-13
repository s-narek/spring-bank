package com.narek.bank.springbank.mapper;

import com.narek.bank.springbank.model.entity.Account;
import com.narek.bank.springbank.model.response.AccountDto;
import com.narek.bank.springbank.model.response.CreateAccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    /**
     * Gives account access to the mapper implementation.
     */
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    /**
     * Map entity to dto.
     * @param account - client's account
     * @return AccountDto
     */
    AccountDto map(Account account);

    /**
     * Map dto to entity.
     * @param accountDto - client's accountDto
     * @return client's account
     */
    Account map(AccountDto accountDto);

    /**
     * Map entity to dto.
     * @param account - client's account
     * @return accountDto
     */
    CreateAccountDto mapAccountToCreateAccountDto(Account account);
}
