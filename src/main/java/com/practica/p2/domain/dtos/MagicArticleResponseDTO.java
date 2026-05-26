package com.practica.p2.domain.dtos;

import com.practica.p2.domain.MagicProvider;
import com.practica.p2.domain.enums.Type;
import java.math.BigDecimal;
import java.util.UUID;

public class MagicArticleResponseDTO {
    private UUID uuid;
    private String name;
    private Type type;
    private BigDecimal price;
    private MagicProvider provider;
}
