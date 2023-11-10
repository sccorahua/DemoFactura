package com.prueba.factura.mapper;

import com.prueba.factura.dao.entity.ClienteEntity;
import com.prueba.factura.dto.ClienteDTO;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteEntityMapper {

    ClienteEntity convierteDTOAEntity(ClienteDTO cliente);

    ClienteDTO convierteEntityADTO(ClienteEntity cliente);

    List<ClienteEntity> convierteListDTOAEntity(List<ClienteDTO> lista);

    List<ClienteDTO> convierteListEntityADTO(List<ClienteEntity> lista);
}
