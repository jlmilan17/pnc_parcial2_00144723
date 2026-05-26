package com.practica.p2.service;

import com.practica.p2.domain.dtos.MagicProviderRequestDTO;
import com.practica.p2.domain.dtos.MagicProviderResponseDTO;

import java.util.UUID;

public interface iMagicProviderService {
    public MagicProviderResponseDTO create(MagicProviderRequestDTO requestDTO);
    public MagicProviderResponseDTO getProviderById(UUID uuid);
    public MagicProviderResponseDTO updateProvider(UUID uuid, MagicProviderRequestDTO requestDTO);
    public void deleteProvider(UUID uuid);
}
