package com.prueba.factura.dao.repository;

import com.prueba.factura.dao.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer>{
    
}
