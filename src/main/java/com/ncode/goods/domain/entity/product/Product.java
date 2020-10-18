package com.ncode.goods.domain.entity.product;

import com.ncode.goods.domain.entity.AuditEntity;
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
    private Long productId;

    private String productName;

    private BigDecimal price;

    private String dealProductYn;
}
