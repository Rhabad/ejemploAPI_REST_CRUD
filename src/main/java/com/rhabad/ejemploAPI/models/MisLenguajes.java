package com.rhabad.ejemploAPI.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "mis_lenguajes")
public class MisLenguajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private Date lanzamiento;
    private boolean tipado_fuerte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public boolean isTipado_fuerte() {
        return tipado_fuerte;
    }

    public void setTipado_fuerte(boolean tipado_fuerte) {
        this.tipado_fuerte = tipado_fuerte;
    }
}
