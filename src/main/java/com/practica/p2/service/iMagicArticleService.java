package com.practica.p2.service;

import com.practica.p2.domain.MagicProvider;
import com.practica.p2.domain.dtos.MagicArticleRequestDTO;
import com.practica.p2.domain.dtos.MagicArticleResponseDTO;
import com.practica.p2.domain.dtos.MagicProviderRequestDTO;
import com.practica.p2.domain.dtos.MagicProviderResponseDTO;
import com.practica.p2.domain.enums.Type;

import java.math.BigDecimal;
import java.util.UUID;

public interface iMagicArticleService {
    public MagicArticleResponseDTO create(MagicArticleRequestDTO requestDTO);
    public MagicArticleResponseDTO getArtefactsById(UUID uuid);
    public MagicArticleRequestDTO getArtefactsByCategoryOrProviderOrMaxPrice(Type category, MagicProviderRequestDTO providerRequestDTO, BigDecimal price);
    public MagicArticleResponseDTO updateProvider(UUID uuid, MagicArticleRequestDTO requestDTO);
    public void deleteProvider(UUID uuid);
}
