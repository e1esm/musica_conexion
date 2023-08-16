package com.esm.musica_conexion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowsController {

    @GetMapping(name = "/shows")
    public String sayHello(){
        return "Hey there broski!";
    }
}
