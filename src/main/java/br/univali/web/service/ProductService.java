package br.univali.web.service;

import br.univali.web.model.Product;
import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> listProducts();

    Product getById(UUID id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

}
