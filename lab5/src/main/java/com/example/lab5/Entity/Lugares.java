package com.example.lab5.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Lugares")
public class Lugares {
    @Id
    @Column(name = "idLugares")
    private int idlugares;

    @Column(name="nombre_lugar")
    private String nombrelugar;

    @Column(name = "descrip_lugar")
    private String descripcion;

    @Column(name = "fecha_lugar")
    private LocalDate fecha_lugar;
}
