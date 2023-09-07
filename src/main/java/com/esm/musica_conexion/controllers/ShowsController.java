package com.esm.musica_conexion.controllers;

import com.esm.musica_conexion.DTO.ShowDTO;
import com.esm.musica_conexion.Entities.Show;
import com.esm.musica_conexion.services.ShowConverter;
import com.esm.musica_conexion.services.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class ShowsController {

    @Autowired
    ShowsService service;

    @PostMapping(path = "/shows", produces = "application/json")
    public @ResponseBody ResponseEntity<ShowDTO> addShow(@RequestBody ShowDTO show){
        return new ResponseEntity<>(service.AddShow(ShowConverter.EntityFrom(show)),HttpStatus.OK);
    }
}
