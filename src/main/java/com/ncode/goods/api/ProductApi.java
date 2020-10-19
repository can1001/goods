package com.ncode.goods.api;

import com.ncode.goods.domain.entity.product.Product;
import com.ncode.goods.domain.entity.product.ProductGroup;
import com.ncode.goods.repository.ProductGroupRepository;
import com.ncode.goods.repository.ProductRepository;
import com.ncode.goods.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Api
@RestController
@RequestMapping("/v1/api/product")
public class ProductApi {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @Autowired
    ProductGroupRepository productGroupRepository;

    /**
     * 상품 목록 api
     * @return
     */
    @GetMapping("/productList")
    public Iterable<Product> getProductList() {
        return productRepository.findAll();
    }

    /**
     * 상품 상세 정보 api
     * @param productCode
     * @return
     */
    @GetMapping("/product/{productCode}")
    public Product getProductInfo(@PathVariable int productCode) {
        return productRepository.findByProductCode(productCode);
    }

    /**
     * 단품 상품 목록 api
     * @return
     */
    @GetMapping("/subProductList")
    public Iterable<Product> getSubProductList() {
        return productRepository.findByProductType("S");
    }

    /**
     * 옵션구매상품의 서브 상품 정보 목록 api
     * @return
     */
    @GetMapping("/options")
    public Iterable<ProductGroup> getOptionProductList() {
        return productGroupRepository.findByParentProductCode(9);
    }
}
