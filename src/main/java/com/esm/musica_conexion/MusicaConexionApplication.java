package com.esm.musica_conexion;

import com.esm.musica_conexion.controllers.ShowsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.esm.musica_conexion.controllers")
public class MusicaConexionApplication {
    public static void main(String[] args) {
        SpringApplication.run(MusicaConexionApplication.class, args);
    }
}
