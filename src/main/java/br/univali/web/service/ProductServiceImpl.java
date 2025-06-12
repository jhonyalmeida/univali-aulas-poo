package br.univali.web.service;

import br.univali.web.model.Product;
import br.univali.web.repository.ProductRepository;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listProducts() {
        return Collections.emptyList();
    }

    @Override
    public Product getById(UUID id) {
        return productRepository.findbyId(id)
                .orElseThrow(() -> new RuntimeException("product not found"));
    }

    @Override
    public Product createProduct(Product product) {
        productRepository.save(product.withId(UUID.randomUUID()));
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        Product current = getById(product.getId());
        productRepository.save(product);
        return product;
    }

}
