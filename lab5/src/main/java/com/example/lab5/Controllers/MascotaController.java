package com.example.lab5.Controllers;
import com.example.lab5.Entity.Mascotas;
import com.example.lab5.Entity.Viajes;
import com.example.lab5.Repository.MascotaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MascotaController {
    final MascotaRepository mascotaRepository;
    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping("/listaMascotas")
    public String listarMascotas(Model model) {
        List<Mascotas> lista = mascotaRepository.listarMascotas();
        model.addAttribute("listamascotas", lista);
        return "/mascotas";
    }

    @GetMapping("/nuevaMascota")
    public String nuevoMascota() {
        return "/formMascota";
    }

    @PostMapping("/guardarMascota")
    public String guardarMascota(Mascotas mascotas) {
        mascotaRepository.save(mascotas);
        return "redirect:/mascotas";
    }
}
