package com.narek.bank.springbank.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "client_information", schema = "bank")
public class Client {

    /**
     * Client's id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
