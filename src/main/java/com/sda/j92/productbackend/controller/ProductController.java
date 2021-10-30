package com.sda.j92.productbackend.controller;

import com.sda.j92.productbackend.model.Product;
import com.sda.j92.productbackend.model.ProductState;
import com.sda.j92.productbackend.model.ProductType;
import com.sda.j92.productbackend.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @CrossOrigin()
    @GetMapping("")
    public List<Product> get(){
        return productService.findAll();
    }

    @CrossOrigin()
    @GetMapping("/types")
    public List<ProductType> getProductTypes(){
        return Arrays.asList(ProductType.values());
    }

    @CrossOrigin()
    @GetMapping("/states")
    public List<ProductState> getProductStates(){
        return Arrays.asList(ProductState.values());
    }

    @CrossOrigin()
    @PostMapping("")
    public void add(@RequestBody Product product){
        productService.add(product);
    }

    @CrossOrigin()
    @DeleteMapping("/{id}")
    public void add(@PathVariable Long id){
        productService.delete(id);
    }

}
