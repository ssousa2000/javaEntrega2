package com.coderhouse.entrega2.repository;

import com.coderhouse.entrega2.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
