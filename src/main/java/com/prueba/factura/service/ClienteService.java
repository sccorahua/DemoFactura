package com.prueba.factura.service;

import com.prueba.factura.dto.ClienteDTO;
import java.util.List;

public interface ClienteService {

    public List<ClienteDTO> listarTodo();

    public ClienteDTO obtenerUno(int codigo);

}
