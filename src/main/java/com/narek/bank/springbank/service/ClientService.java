package com.narek.bank.springbank.service;

import java.math.BigDecimal;

public interface ClientService {
    BigDecimal getBalance(Long id);
}
