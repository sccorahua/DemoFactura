package com.prueba.factura.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "factura")
public class FacturaEntity {
    @Id
    private int nro;
    private double importe;
    @OneToOne
    @JoinColumn(name = "idcli", referencedColumnName = "idcli")
    private ClienteEntity idcli;
}
