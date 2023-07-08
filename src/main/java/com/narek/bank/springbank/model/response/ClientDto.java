package com.narek.bank.springbank.model.response;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Data
@Builder
@Jacksonized
@RequiredArgsConstructor
public class ClientDto {

    /**
     * Client's id.
     */
    private final UUID id;

    /**
     * Client's name.
     */
    private final String firstName;

    /**
     * Client's lastName.
     */
    private final String lastName;

    /**
     * Client's age.
     */
    private final int age;

    /**
     * Client's address.
     */
    private final String address;

    /**
     * Client's phone number.
     */
    private final String phoneNumber;

    /**
     * Client's email.
     */
    private final String email;
}
