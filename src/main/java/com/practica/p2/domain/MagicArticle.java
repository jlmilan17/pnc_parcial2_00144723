package com.practica.p2.domain;

import com.practica.p2.domain.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MagicArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private String name;

    @Enumerated(EnumType.STRING)
    private Type type;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "provider_uuid")
    private MagicProvider provider;

}
