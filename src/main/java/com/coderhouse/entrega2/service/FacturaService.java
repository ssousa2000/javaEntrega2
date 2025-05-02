package com.coderhouse.entrega2.service;

import com.coderhouse.entrega2.model.Factura;
import com.coderhouse.entrega2.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> obtenerFacturas() {
        return facturaRepository.findAll();
    }

    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void eliminarFactura(Long id) {
        facturaRepository.deleteById(id);
    }

    public Factura obtenerFacturaPorId(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }
}
