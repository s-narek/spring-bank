package com.narek.bank.springbank.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Client {

    @Id
    private Long id;

    private BigDecimal balance;
}
