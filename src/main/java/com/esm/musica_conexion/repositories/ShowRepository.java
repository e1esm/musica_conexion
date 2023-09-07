package com.esm.musica_conexion.repositories;


import com.esm.musica_conexion.Entities.Show;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShowRepository extends CrudRepository<Show, UUID> {

}
