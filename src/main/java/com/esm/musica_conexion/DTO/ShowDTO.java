package com.esm.musica_conexion.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowDTO{

    private Date date;

    private String city;

    private int amount;

    private double price;

    private String place;

}
