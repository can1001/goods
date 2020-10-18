package com.ncode.goods.domain.dto.product;

import com.ncode.goods.domain.entity.product.Product;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    String productName;

    @Data
    public static class ProductAddDto extends ProductDto {

        public Product toProduct() { return Product.builder().productName(productName).build(); }
    }
}
