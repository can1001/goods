package com.ncode.goods.repository;

import com.ncode.goods.domain.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
