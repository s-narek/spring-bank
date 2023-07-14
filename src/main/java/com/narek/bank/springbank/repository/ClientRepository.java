package com.narek.bank.springbank.repository;

import com.narek.bank.springbank.model.entity.Client;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {
    /**
     * Get of all clients with pagination.
     * @param pageable - number of pages and limit per page
     * @return - client's
     */
    Slice<Client> findAllBy(Pageable pageable);
}
