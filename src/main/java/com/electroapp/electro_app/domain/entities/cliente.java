package com.electroapp.electro_app.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double porcentajeProntoPago;
    private String fechaAnac;

    @ManyToOne
    @JoinColumn(name = "tercero_id")
    private terceros tercero;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPorcentajeProntoPago() {
        return porcentajeProntoPago;
    }

    public void setPorcentajeProntoPago(Double porcentajeProntoPago) {
        this.porcentajeProntoPago = porcentajeProntoPago;
    }

    public String getFechaAnac() {
        return fechaAnac;
    }

    public void setFechaAnac(String fechaAnac) {
        this.fechaAnac = fechaAnac;
    }

    public terceros getTercero() {
        return tercero;
    }

    public void setTercero(terceros tercero) {
        this.tercero = tercero;
    }
}