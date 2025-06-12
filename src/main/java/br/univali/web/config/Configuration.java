package br.univali.web.config;

import br.univali.web.controller.ProductController;
import br.univali.web.controller.mapper.ProductMapper;
import br.univali.web.repository.ProductRepository;
import br.univali.web.repository.ProductRepositoryInMemory;
import br.univali.web.service.ProductService;
import br.univali.web.service.ProductServiceImpl;
import io.javalin.Javalin;

public class Configuration {

    public Configuration() {
        init();
    }

    private void init() {
        ProductRepository productRepository = new ProductRepositoryInMemory();
        ProductService  productService = new ProductServiceImpl(productRepository);
        ProductMapper productMapper = new ProductMapper();
        ProductController productController = new ProductController(productService, productMapper);

        try (Javalin app = Javalin.create()
                .get("/products", productController::listProducts)
                .get("products/{id}", productController::getProduct)
                .start(8081)) {
            System.out.println("server started");
        }
    }

}
