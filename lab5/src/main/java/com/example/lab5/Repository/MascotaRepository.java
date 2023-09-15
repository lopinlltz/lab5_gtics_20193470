package com.example.lab5.Repository;

import com.example.lab5.Controllers.MascotaController;
import com.example.lab5.Entity.Mascotas;
import com.example.lab5.Entity.Viajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MascotaRepository extends JpaRepository<Mascotas, Integer> {
    @Query(nativeQuery = true, value = "select * from mascotas")
    List<Mascotas> listarMascotas();
}
