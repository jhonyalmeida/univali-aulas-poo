package br.univali.web.repository;

import br.univali.web.model.Product;

import java.util.*;

public class ProductRepositoryInMemory implements ProductRepository {

    private final Map<UUID, Product> PRODUCTS = new HashMap<>();

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(PRODUCTS.values());
    }

    @Override
    public Optional<Product> findbyId(UUID id) {
        return Optional.ofNullable(PRODUCTS.get(id));
    }

    @Override
    public void save(Product product) {
        PRODUCTS.put(product.getId(), product);
    }
}
