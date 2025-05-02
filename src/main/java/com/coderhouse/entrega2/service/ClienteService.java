package com.coderhouse.entrega2.service;

import com.coderhouse.entrega2.model.Cliente;
import com.coderhouse.entrega2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente obtenerClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}

