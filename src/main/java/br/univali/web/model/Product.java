package br.univali.web.model;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private String description;
    private Double price;

    public Product(UUID id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Product withId(UUID id) {
        return new Product(id, name, description, price);
    }

}
