package com.prueba.factura.dao;

import com.prueba.factura.dto.ClienteDTO;
import java.util.List;

public interface ClienteDAO {
    public List<ClienteDTO> listarTodo();
    
    public ClienteDTO obtenerUno(int codigo);
}
