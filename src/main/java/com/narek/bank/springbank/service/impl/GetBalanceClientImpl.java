package com.narek.bank.springbank.service.impl;

import com.narek.bank.springbank.service.GetBalanceClient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GetBalanceClientImpl implements GetBalanceClient {
    @Override
    public BigDecimal getBalance(Long id) {
        return BigDecimal.valueOf(88);
    }
}
