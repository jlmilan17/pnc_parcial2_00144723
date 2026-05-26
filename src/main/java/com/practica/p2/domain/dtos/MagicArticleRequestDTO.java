package com.practica.p2.domain.dtos;

import com.practica.p2.domain.MagicProvider;
import com.practica.p2.domain.enums.Type;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MagicArticleRequestDTO {
    @NotBlank(message = "El nombre es obligatorio.")
    private String name;
    @NotNull(message = "El Tipo es obligatorio")
    private Type type;
    @NotNull(message = "El precio es obligatorio")
    @Min(value = 0, message = "El precio debe de ser positivo")
    private BigDecimal price;
    @NotNull(message = "El proveedor es obligatorio")
    private MagicProvider provider;
}
