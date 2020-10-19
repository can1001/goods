package com.ncode.goods.domain.entity.product;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@EqualsAndHashCode(of = "productGroup")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCT_GROUP")
public class ProductGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productGroupSeq;

    private int parentProductCode;

    private int productCode;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCode")
    List<Product> products;
}
