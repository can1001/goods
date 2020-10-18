package com.ncode.goods.api;

import com.ncode.goods.repository.ProductRepository;
import com.ncode.goods.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/v1/api")
public class ProductApi {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

}
