package com.prueba.factura.service;

import com.prueba.factura.dto.FacturaDTO;
import java.util.List;

public interface FacturaService {

    public List<FacturaDTO> listarTodo();

    public void insertar(FacturaDTO fac);

    public void modificar(FacturaDTO fac);

    public void eliminar(int codigo);

    public FacturaDTO obtenerUno(int codigo);
}
