package com.prueba.factura.dao.repository;

import com.prueba.factura.dao.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer>{
    
}
