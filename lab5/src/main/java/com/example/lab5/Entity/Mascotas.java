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
@Table(name="mascotas")
public class Mascotas {
    @Id
    @Column(name="idMascotas")
    private  int idMascotas;

    @Column(name="nombre_mascota")
    private String nombremascota;

    @Column(name="genero")
    private String genero;

    @Column(name = "edad")
    private String edad;

    @Column(name = "fecha_nacimiento")
    private String fechanacimiento;

    @Column(name = "vacunado")
    private String vacunado;

    @Column(name="desparasitado")
    private String desparasitado;

}
