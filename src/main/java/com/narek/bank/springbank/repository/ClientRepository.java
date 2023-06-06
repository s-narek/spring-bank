package com.narek.bank.springbank.repository;

import com.narek.bank.springbank.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
