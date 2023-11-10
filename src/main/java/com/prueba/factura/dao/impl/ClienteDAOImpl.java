package com.prueba.factura.dao.impl;

import com.prueba.factura.dao.ClienteDAO;
import com.prueba.factura.dao.repository.ClienteRepository;
import com.prueba.factura.dto.ClienteDTO;
import com.prueba.factura.mapper.ClienteEntityMapper;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDAOImpl implements ClienteDAO{

    private final ClienteEntityMapper mapper = Mappers.getMapper(ClienteEntityMapper.class);
    
    @Autowired
    private ClienteRepository rep;
    
    @Override
    public List<ClienteDTO> listarTodo() {
        return mapper.convierteListEntityADTO(rep.findAll());
    }

    @Override
    public ClienteDTO obtenerUno(int codigo) {
        return mapper.convierteEntityADTO(rep.findById(codigo).orElse(null));
    }
    
}
