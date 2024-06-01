package com.aluracursos.screenmatch.controller;

import com.aluracursos.screenmatch.dto.SerieDTO;
import com.aluracursos.screenmatch.repository.SerieRepository;
import com.aluracursos.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping()
    public List<SerieDTO> obtenerSeries() {

        return serieService.obtenerSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtenerTop5(){
        return serieService.obtenerTop5();
    }

    @GetMapping("/lanzamientos")
    public List<SerieDTO> lanzamientos(){
        return serieService.obtenerLanzamientosMasRecientes();
    }

    @GetMapping("/{id}")
    public SerieDTO obtenerPorId(@PathVariable Long id){
        return serieService.obtenerPorId(id);
    }
}