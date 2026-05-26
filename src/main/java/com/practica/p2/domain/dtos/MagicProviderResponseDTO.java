package com.practica.p2.domain.dtos;

import com.practica.p2.domain.enums.Type;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;
@Builder
@Getter
public class MagicProviderResponseDTO {
    private UUID uuid;
    private String name;
    private Type type;
}
