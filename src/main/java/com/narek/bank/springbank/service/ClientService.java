package com.narek.bank.springbank.service;

import java.math.BigDecimal;

public interface ClientService {
    /**
     * Get client balance.
     * @param clientId id client
     * @return balance client's
     */
    BigDecimal getBalanceClient(Long clientId);
}
