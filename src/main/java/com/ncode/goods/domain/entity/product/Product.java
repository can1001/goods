package com.ncode.goods.domain.entity.product;

import com.ncode.goods.domain.entity.AuditEntity;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@EqualsAndHashCode(of = "productId")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT")
public class Product extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private String productName;

}
