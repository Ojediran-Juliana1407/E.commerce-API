package com.septa.ECommerce.controller;

import com.septa.ECommerce.dto.ProductDto;
import com.septa.ECommerce.services.ProductServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class ProductController {

    private final ProductServices productServices;

    public ProductController(ProductServices productServices){
        this.productServices = productServices;
    }

    @PostMapping(value = "/product/create")
    public Object createProduct(@RequestBody ProductDto productDto) {
        return productServices.createProduct(productDto);
    }

    @GetMapping("")
    public Object GetAllProduct() {
        return productServices.GetAllProduct();
    }


    @GetMapping("/get/{id}")
    public Object GetProductId(@PathVariable long id) {
        return productServices.GetProductById(id);
    }

    }














