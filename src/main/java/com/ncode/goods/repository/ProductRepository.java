package com.ncode.goods.repository;

import com.ncode.goods.domain.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductType(String productType);

    Product findByProductCode(int productCode);
}
