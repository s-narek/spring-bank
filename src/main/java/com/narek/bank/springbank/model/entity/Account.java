package com.narek.bank.springbank.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "account", schema = "bank")
public class Account {
    /**
     * Account id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    /**
     * Account number.
     */
    private Long number;

    /**
     * Account balance.
     */
    private BigDecimal balance;

    /**
     * Foreign key.
     */
    @Column(name = "client_id")
    private UUID clientId;
}
