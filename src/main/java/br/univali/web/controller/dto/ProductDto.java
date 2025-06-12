package br.univali.web.controller.dto;

import java.util.UUID;

public class ProductDto {

    private UUID id;
    private String name;
    private String details;
    private Double price;

    public ProductDto(UUID id, String name, String details, Double price) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public Double getPrice() {
        return price;
    }
}
