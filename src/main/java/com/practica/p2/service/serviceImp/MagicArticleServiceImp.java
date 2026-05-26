package com.practica.p2.service.serviceImp;

import com.practica.p2.domain.dtos.MagicArticleRequestDTO;
import com.practica.p2.domain.dtos.MagicArticleResponseDTO;
import com.practica.p2.domain.dtos.MagicProviderRequestDTO;
import com.practica.p2.domain.enums.Type;
import com.practica.p2.service.iMagicArticleService;

import java.math.BigDecimal;
import java.util.UUID;

public class MagicArticleServiceImp implements iMagicArticleService {

    @Override
    public MagicArticleResponseDTO create(MagicArticleRequestDTO requestDTO) {
        return null;
    }

    @Override
    public MagicArticleResponseDTO getArtefactsById(UUID uuid) {
        return null;
    }

    @Override
    public MagicArticleRequestDTO getArtefactsByCategoryOrProviderOrMaxPrice(Type category, MagicProviderRequestDTO providerRequestDTO, BigDecimal price) {
        return null;
    }

    @Override
    public MagicArticleResponseDTO updateProvider(UUID uuid, MagicArticleRequestDTO requestDTO) {
        return null;
    }

    @Override
    public void deleteProvider(UUID uuid) {

    }
}
