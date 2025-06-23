package com.farmaciascomunales.stock.service;

import com.farmaciascomunales.stock.model.Inventario;
import com.farmaciascomunales.stock.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    private final InventarioRepository repository;

    public InventarioService(InventarioRepository repository) {
        this.repository = repository;
    }

    public List<Inventario> listar() {
        return repository.findAll();
    }

    public Inventario obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Inventario crear(Inventario inventario) {
        return repository.save(inventario);
    }
}