package com.prueba.factura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO {
    private int nro;
    private double importe;
    private ClienteDTO idcli;
}
