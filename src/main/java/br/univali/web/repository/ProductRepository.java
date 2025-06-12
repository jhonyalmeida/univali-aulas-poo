package br.univali.web.repository;

import br.univali.web.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {

    List<Product> findAll();

    Optional<Product> findbyId(UUID id);

    void save(Product product);

}
