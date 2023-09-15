package com.example.lab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="viajes")
public class Viajes {
    @Id
    @Column(name="idviajes")
    private int idviajes;

    @Column(name="puntorecojo")
    private String puntorecojo;

    @Column(name="cantpersonas")
    private String cantpersonas;

    @Column(name = "cantperros")
    private String cantperros;

    @ManyToOne
    @JoinColumn(name = "Persona_idPersona")
    private Persona idPersona;

    @ManyToOne
    @JoinColumn(name="Lugares_idLugares")
    private Lugares idLugares;
}
