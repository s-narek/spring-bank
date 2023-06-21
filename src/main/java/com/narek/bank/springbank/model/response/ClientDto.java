package com.narek.bank.springbank.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class ClientDto {

    /**
     * Client's id.
     */
    private UUID id;

    /**
     * Client's name.
     */
    private String firstName;

    /**
     * Client's lastName.
     */
    private String lastName;

    /**
     * Client's age.
     */
    private int age;

    /**
     * Client's address.
     */
    private String address;

    /**
     * Client's phone number.
     */
    private String phoneNumber;

    /**
     * Client's email.
     */
    private String email;
}
