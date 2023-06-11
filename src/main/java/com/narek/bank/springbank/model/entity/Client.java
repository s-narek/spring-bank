package com.narek.bank.springbank.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "client_balance", schema = "bank")
public class Client {

    /**
     * Id client.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;

    /**
     * Balance client.
     */
    private BigDecimal balance;
}
