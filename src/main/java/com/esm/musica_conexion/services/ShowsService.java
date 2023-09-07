package com.esm.musica_conexion.services;



import com.esm.musica_conexion.DTO.ShowDTO;
import com.esm.musica_conexion.Entities.Show;
import com.esm.musica_conexion.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.logging.Logger;

@Service
public class ShowsService {

    @Autowired
    ShowRepository repository;

    public ShowDTO AddShow(Show show){
        return ShowConverter.DTOFrom(repository.save(show));
    }
}
