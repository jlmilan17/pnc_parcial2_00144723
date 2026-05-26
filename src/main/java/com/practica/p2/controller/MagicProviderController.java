package com.practica.p2.controller;

import com.practica.p2.domain.dtos.MagicProviderRequestDTO;
import com.practica.p2.domain.dtos.MagicProviderResponseDTO;
import com.practica.p2.service.iMagicProviderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/providers")
@RequiredArgsConstructor
public class MagicProviderController {
    private final iMagicProviderService providerService;

    //POST: 201 - CREATED
    @PostMapping("/")
    ResponseEntity<MagicProviderResponseDTO> create(@Valid @RequestBody MagicProviderRequestDTO requestDTO){
        MagicProviderResponseDTO created = providerService.create(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MagicProviderResponseDTO> getProviderById(@PathVariable UUID id){
        return ResponseEntity.ok(providerService.getProviderById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MagicProviderResponseDTO> updateProvider(@PathVariable UUID id,
                                                                   @Valid @RequestBody MagicProviderRequestDTO requestDTO){
        return ResponseEntity.ok(providerService.updateProvider(id, requestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable UUID id){
        providerService.deleteProvider(id);
        return ResponseEntity.noContent().build();
    }
}
