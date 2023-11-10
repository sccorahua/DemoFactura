package com.prueba.factura.service.impl;

import com.prueba.factura.dao.FacturaDAO;
import com.prueba.factura.dto.FacturaDTO;
import com.prueba.factura.service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements FacturaService{

    @Autowired
    private FacturaDAO dao;
    
    @Override
    public List<FacturaDTO> listarTodo() {
        return dao.listarTodo();
    }

    @Override
    public void insertar(FacturaDTO fac) {
        dao.insertar(fac);
    }

    @Override
    public void modificar(FacturaDTO fac) {
        dao.modificar(fac);
    }

    @Override
    public void eliminar(int codigo) {
        dao.eliminar(codigo);
    }

    @Override
    public FacturaDTO obtenerUno(int codigo) {
        return dao.obtenerUno(codigo);
    }
    
}
