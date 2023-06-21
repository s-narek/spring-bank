package com.narek.bank.springbank.repository;

import com.narek.bank.springbank.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    /**
     * client's search by id.
     * @param id - client's id
     * @return client
     */
    Optional<Client> findById(UUID id);
}
