package com.prueba.factura.service.impl;

import com.prueba.factura.dao.ClienteDAO;
import com.prueba.factura.dto.ClienteDTO;
import com.prueba.factura.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteDAO dao;
    
    @Override
    public List<ClienteDTO> listarTodo() {
        return dao.listarTodo();
    }

    @Override
    public ClienteDTO obtenerUno(int codigo) {
        return dao.obtenerUno(codigo);
    }
    
}
