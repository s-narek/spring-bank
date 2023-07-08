package com.narek.bank.springbank.model.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "client", schema = "bank")
public class Client extends Timestamped {

    /**
     * Client's id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
