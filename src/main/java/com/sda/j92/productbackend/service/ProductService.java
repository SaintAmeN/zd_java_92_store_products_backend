package com.sda.j92.productbackend.service;

import com.sda.j92.productbackend.model.Product;
import com.sda.j92.productbackend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> products = productRepository.findAll();
        log.info("GetAll : " + products);
        return products;
    }

    public void add(Product productToAdd){
        log.info("Add : " + productToAdd);
        productRepository.save(productToAdd);
    }

    public void delete(Long id){
        log.info("Remove : " + id);
        productRepository.deleteById(id);
    }
}
