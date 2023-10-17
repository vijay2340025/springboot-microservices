package com.example.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    private int id;
    @Column
    private String brand;
    @Column(name = "model_name")
    private String modelName;
    @Column
    private String os;
    @Column
    private String storage;
    @Column
    private String memory;
    @Column(name = "screen_size")
    private String screenSize;
    @Column
    private String color;
    @Column
    private String tag;
}
