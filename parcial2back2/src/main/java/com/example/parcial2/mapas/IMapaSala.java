package com.example.parcial2.mapas;

import com.example.parcial2.Sala;
import com.example.parcial2.dtos.SalaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaSala {

    @Mapping(source = "cine.id", target = "cineId")
    com.example.parcial2.dtos.SalaDTO convertirModeloADto(Sala sala);

    @Mapping(source = "cineId", target = "cine.id")
    Sala convertirDtoAModelo(SalaDTO salaDTO);

    List<SalaDTO> convertirListaADto(List<Sala> lista);

    List<Sala> convertirListaAModelo(List<SalaDTO> lista);
}
