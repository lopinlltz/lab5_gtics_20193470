package com.example.lab5.Controllers;

import com.example.lab5.Entity.Viajes;
import com.example.lab5.Repository.ViajesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ViajesController {
    final ViajesRepository viajesRepository;
    public ViajesController(ViajesRepository viajesRepository) {
        this.viajesRepository = viajesRepository;
    }
    @GetMapping("/listaViajes")
    public String listarViajes(Model model) {
        List<Viajes> lista = viajesRepository.listarViajes();
        model.addAttribute("listaviajes", lista);
        return "/viajes";
    }

    @GetMapping("/nuevoViaje")
    public String nuevoViaje() {
        return "/FormViaje";
    }

    @PostMapping("/guardarViaje")
    public String guardarViaje(Viajes viajes) {
        viajesRepository.save(viajes);
        return "redirect:/viajes";
    }


}
