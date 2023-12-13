package com.septa.ECommerce.services;

import com.septa.ECommerce.controller.ProductController;
import com.septa.ECommerce.dto.ProductDto;
import com.septa.ECommerce.model.Product;
import com.septa.ECommerce.repository.ProductRepository;

public class ProductServices {
    private final ProductRepository productRepository;

    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Object createProduct(ProductDto productDto) {
        Product product = new Product();

        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setStockQuantity(product.getStockQuantity());

        return productRepository.save(product);
    }

    public Object GetAllProduct() {
        return productRepository.findAll();
    }

    public Object GetProductById(long id){
        return productRepository.findById(id);
    }




}
