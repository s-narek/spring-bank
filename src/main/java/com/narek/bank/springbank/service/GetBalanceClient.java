package com.narek.bank.springbank.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface GetBalanceClient {
    BigDecimal getBalance(Long id);
}
