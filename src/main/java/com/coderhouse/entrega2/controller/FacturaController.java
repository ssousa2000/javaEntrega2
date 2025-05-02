package com.coderhouse.entrega2.controller;

import com.coderhouse.entrega2.model.Factura;
import com.coderhouse.entrega2.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<Factura> obtenerFacturas() {
        return facturaService.obtenerFacturas();
    }

    @GetMapping("/{id}")
    public Factura obtenerFacturaPorId(@PathVariable Long id) {
        return facturaService.obtenerFacturaPorId(id);
    }

    @PostMapping
    public Factura guardarFactura(@RequestBody Factura factura) {
        return facturaService.guardarFactura(factura);
    }

    @DeleteMapping("/{id}")
    public void eliminarFactura(@PathVariable Long id) {
        facturaService.eliminarFactura(id);
    }
}
