package com.prueba.factura.mapper;

import com.prueba.factura.dao.entity.FacturaEntity;
import com.prueba.factura.dto.FacturaDTO;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface FacturaEntityMapper {

    FacturaEntity convierteDTOAEntity(FacturaDTO factura);

    FacturaDTO convierteEntityADTO(FacturaEntity factura);

    List<FacturaEntity> convierteListDTOAEntity(List<FacturaDTO> lista);

    List<FacturaDTO> convierteListEntityADTO(List<FacturaEntity> lista);
}
