package com.himanshu.store.services;

import com.himanshu.store.entities.Product;
import com.himanshu.store.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id ,Product product){
        // Think like this to update dont you think ki we need to check first ki
        // bhai ye product exist bhi karta hai ki nahi
        Product existingProd = productRepository.findById(id).orElseThrow(()->
                new RuntimeException("Product not found with this id " + id));

        //If it exsits then simply update it with new values
        existingProd.setName(product.getName());
        existingProd.setDescription(product.getDescription());
        existingProd.setCategory(product.getCategory());
        existingProd.setPrice(BigDecimal.valueOf(product.getId()));
        existingProd.setStockQuantity(product.getStockQuantity());

        return productRepository.save(existingProd);
    }

    @GetMapping
    public List<Product> getProducts(){
        return  productRepository.findAll();
    }

    public Product getProductById( Long id){
        return productRepository.findById(id).orElseThrow(()->
               new RuntimeException("Product with this Id doesnt exists"));

    }

    public void deleteProduct(Long id){
            productRepository.deleteById(id);
    }
}
