package br.univali.web.controller.mapper;

import br.univali.web.controller.dto.ProductDto;
import br.univali.web.model.Product;

public class ProductMapper {

    public Product mapToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getName(), productDto.getDetails(), productDto.getPrice());
    }

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }

}
