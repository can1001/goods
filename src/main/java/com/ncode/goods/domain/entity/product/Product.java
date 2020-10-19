package com.ncode.goods.domain.entity.product;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@Builder
@Entity
@EqualsAndHashCode(of = "productId")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productCode;

    private String productName;

    private String productDesc;

    private BigDecimal productPrice;

    private String productType;
}
