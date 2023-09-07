package com.esm.musica_conexion.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Show {
    @Column(name = "id")
    private @Id UUID ID;

    private Date date;

    private String city;

    private int amount;

    private double price;

    private String place;

    private Date insertion_date;

    public Show(UUID id, Date date, String city, int amount, double price, String place){
        this.ID = id;
        this.date = date;
        this.city = city;
        this.amount = amount;
        this.price = price;
        this.place = place;
        this.insertion_date = new Date();
    }
}
