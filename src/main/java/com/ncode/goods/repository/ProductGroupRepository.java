package com.ncode.goods.repository;

import com.ncode.goods.domain.entity.product.Product;
import com.ncode.goods.domain.entity.product.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
    Iterable<ProductGroup> findByParentProductCode(int parentProductCode);
}
