package com.ncode.goods.service;

import com.ncode.goods.domain.dto.product.ProductDto;
import com.ncode.goods.domain.entity.product.Product;
import com.ncode.goods.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product create(ProductDto.ProductAddDto productAddDto) {
        Product product = new Product();
        product = productRepository.save(product);
        return product;
    }
}
