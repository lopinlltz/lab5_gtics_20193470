package com.example.lab5.Repository;

import com.example.lab5.Entity.Viajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViajesRepository extends JpaRepository<Viajes, Integer> {
    @Query(nativeQuery = true, value = "select * from viajes")
    List<Viajes> listarViajes();
}
