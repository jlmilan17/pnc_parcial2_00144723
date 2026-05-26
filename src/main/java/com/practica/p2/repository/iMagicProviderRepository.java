package com.practica.p2.repository;

import com.practica.p2.domain.MagicProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface iMagicProviderRepository extends JpaRepository<MagicProvider, UUID> {
    boolean existsByNameIgnoreCase(String name);
}
