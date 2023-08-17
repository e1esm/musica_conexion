package com.esm.musica_conexion.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ShowsController {
    @GetMapping(name = "/shows", produces = "application/json")
    public @ResponseBody String sayHello(){
        return "Hey there!";
    }
}
