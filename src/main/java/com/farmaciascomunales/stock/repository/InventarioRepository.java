package com.farmaciascomunales.stock.repository;

import com.farmaciascomunales.stock.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}