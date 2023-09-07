package com.esm.musica_conexion.services;

import com.esm.musica_conexion.DTO.ShowDTO;
import com.esm.musica_conexion.Entities.Show;

import java.util.UUID;

public class ShowConverter {
    public static Show EntityFrom(ShowDTO show){
        return new Show(
                UUID.randomUUID(),
                show.getDate(),
                show.getCity(),
                show.getAmount(),
                show.getPrice(),
                show.getPlace());
    }
    public static ShowDTO DTOFrom(Show show){
        return new ShowDTO(
                show.getDate(),
                show.getCity(),
                show.getAmount(),
                show.getPrice(),
                show.getPlace()
        );
    }
}
