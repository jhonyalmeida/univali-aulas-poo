package br.univali.web.controller;

import br.univali.web.controller.dto.ProductDto;
import br.univali.web.controller.mapper.ProductMapper;
import br.univali.web.model.Product;
import br.univali.web.service.ProductService;
import io.javalin.http.Context;

import java.util.UUID;

public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    public void listProducts(Context ctx) {
        ctx.json(productService.listProducts());
    }

    public void getProduct(Context ctx) {
        UUID id = UUID.fromString(ctx.pathParam("id"));
        Product product = productService.getById(id);
        ctx.json(productMapper.mapToProductDto(product));
    }

    public void addProduct(Context ctx) {
        ProductDto dto = ctx.bodyAsClass(ProductDto.class);
        Product product = productService.createProduct(productMapper.mapToProduct(dto));
        ctx.json(productMapper.mapToProductDto(product));
    }

}
