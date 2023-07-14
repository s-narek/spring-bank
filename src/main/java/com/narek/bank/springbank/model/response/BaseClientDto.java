package com.narek.bank.springbank.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
public abstract class BaseClientDto {
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
