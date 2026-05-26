package com.practica.p2.service.serviceImp;

import com.practica.p2.domain.MagicProvider;
import com.practica.p2.domain.dtos.MagicProviderRequestDTO;
import com.practica.p2.domain.dtos.MagicProviderResponseDTO;
import com.practica.p2.exceptionHandler.DuplicateResourceException;
import com.practica.p2.exceptionHandler.ResourceNotFoundException;
import com.practica.p2.repository.iMagicProviderRepository;
import com.practica.p2.service.iMagicProviderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class MagicProviderServiceImp implements iMagicProviderService {
    private final iMagicProviderRepository providerRepository;


    @Override
    public MagicProviderResponseDTO create(MagicProviderRequestDTO requestDTO) {
        if(providerRepository.existsByNameIgnoreCase(requestDTO.getName())){
            throw new DuplicateResourceException(
                    "Ya existe un proveedor con el nombre: " + requestDTO.getName()
            );
        }

        MagicProvider magicProviderToDB = MagicProvider.builder()
                .name(requestDTO.getName())
                .type(requestDTO.getType())
                .build();

        MagicProvider savedMagicProvider = providerRepository.save(magicProviderToDB);

        return toResponse(savedMagicProvider);
    }

    @Override
    public MagicProviderResponseDTO getProviderById(UUID uuid) {
        MagicProvider provider =  providerRepository.findById(uuid)
                .orElseThrow(() -> new ResourceNotFoundException("Elemento no encontrado"));

        return toResponse(provider);
    }

    @Override
    public MagicProviderResponseDTO updateProvider(UUID uuid, MagicProviderRequestDTO requestDTO) {
        MagicProvider provider = providerRepository.findById(uuid).orElseThrow(() -> new ResourceNotFoundException(
                "Proveedor " + requestDTO.getName() + " " + "no encontrado"
        ));

        provider.setName(requestDTO.getName());
        provider.setType(requestDTO.getType());

        MagicProvider providerUpdated =providerRepository.save(provider);

        return toResponse(providerUpdated);
    }

    @Override
    public void deleteProvider(UUID uuid) {
        if(!providerRepository.existsById(uuid)){
            throw new ResourceNotFoundException("Proveedor no encontrado");
        }

        providerRepository.deleteById(uuid);

    }
    private MagicProviderResponseDTO toResponse(MagicProvider provider){
            return MagicProviderResponseDTO.builder()
                    .uuid(provider.getUuid())
                    .name(provider.getName())
                    .type(provider.getType())
                    .build();
    }
}
