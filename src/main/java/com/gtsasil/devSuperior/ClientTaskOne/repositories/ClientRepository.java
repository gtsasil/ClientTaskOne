package com.gtsasil.devSuperior.ClientTaskOne.repositories;

import com.gtsasil.devSuperior.ClientTaskOne.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
