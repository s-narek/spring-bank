package com.narek.bank.springbank.service.impl;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // should get userName from spring security
        return Optional.of("Test");
    }
}
