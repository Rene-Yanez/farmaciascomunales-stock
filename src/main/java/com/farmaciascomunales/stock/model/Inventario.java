package com.farmaciascomunales.stock.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idProducto; // ID del microservicio productos
    private String lote;
    private int cantidad;
    private int precioUnitario;

    private LocalDate fechaIngreso;

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getIdProducto() { return idProducto; }

    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }

    public String getLote() { return lote; }

    public void setLote(String lote) { this.lote = lote; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public int getPrecioUnitario() { return precioUnitario; }

    public void setPrecioUnitario(int precioUnitario) { this.precioUnitario = precioUnitario; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }

    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
}