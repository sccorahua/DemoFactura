package com.prueba.factura.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class ClienteEntity {
    @Id
    private int idcli;
    private String nombre;
}
