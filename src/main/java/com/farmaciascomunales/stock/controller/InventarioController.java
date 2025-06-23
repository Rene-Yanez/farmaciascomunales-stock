package com.farmaciascomunales.stock.controller;

import com.farmaciascomunales.stock.model.Inventario;
import com.farmaciascomunales.stock.service.InventarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Inventario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Inventario obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Inventario crear(@RequestBody Inventario inventario) {
        return service.crear(inventario);
    }
}