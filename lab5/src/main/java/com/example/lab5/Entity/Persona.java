package com.example.lab5.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Persona")
public class Persona {
    @Id
    @Column(name="idPersona")
    private int idpersona;

    @Column(name="nombre")
    private String nombre;

    @Column(name="dni")
    private String dni;

    @Column(name="celular")
    private String celular;

    @Column(name="tipo_persona")
    private String tipopersona;
}