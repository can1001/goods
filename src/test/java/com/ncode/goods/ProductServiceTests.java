package com.ncode.goods;

import com.ncode.goods.domain.entity.product.Product;
import com.ncode.goods.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
public class ProductServiceTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void saveProductTest() {

        Product product = new Product();
        product.setProductName("티셔츠 1+1");
        productRepository.save(product);

        Product retrivedProduct = productRepository.findById(product.getProductId()).get();

        Assert.assertEquals(retrivedProduct.getProductName(), "티셔츠 1+1");
    }
}
