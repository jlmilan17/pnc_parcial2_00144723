package com.practica.p2.domain.dtos;

import com.practica.p2.domain.enums.Type;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MagicProviderRequestDTO {
    @NotBlank(message = "El nombre es obligatorio.")
    private String name;
    @NotNull(message = "El tipo es obligatorio.")
    private Type type;
}
