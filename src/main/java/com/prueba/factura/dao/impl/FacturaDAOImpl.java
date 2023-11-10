package com.prueba.factura.dao.impl;

import com.prueba.factura.dao.FacturaDAO;
import com.prueba.factura.dao.repository.FacturaRepository;
import com.prueba.factura.dto.FacturaDTO;
import com.prueba.factura.mapper.FacturaEntityMapper;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaDAOImpl implements FacturaDAO {

    private FacturaEntityMapper mapper = Mappers.getMapper(FacturaEntityMapper.class);

    @Autowired
    private FacturaRepository rep;

    @Override
    public List<FacturaDTO> listarTodo() {
        return mapper.convierteListEntityADTO(rep.findAll());
    }

    @Override
    public void insertar(FacturaDTO fac) {
        rep.save(mapper.convierteDTOAEntity(fac));
    }

    @Override
    public void modificar(FacturaDTO fac) {
        rep.save(mapper.convierteDTOAEntity(fac));
    }

    @Override
    public void eliminar(int codigo) {
        rep.deleteById(codigo);
    }

    @Override
    public FacturaDTO obtenerUno(int codigo) {
        return mapper.convierteEntityADTO(rep.findById(codigo).orElse(null));
    }

}
