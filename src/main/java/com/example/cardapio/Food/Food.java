package com.example.cardapio.Food;

import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    //    Identity porque é uma aplicação simples UUID
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private String image;
    private Integer price;
}
