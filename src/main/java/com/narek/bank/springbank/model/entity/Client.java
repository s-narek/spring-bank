package com.narek.bank.springbank.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
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
    @Column(name = "id")
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

    /**
     * Client's account.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private List<Account> account;
}
