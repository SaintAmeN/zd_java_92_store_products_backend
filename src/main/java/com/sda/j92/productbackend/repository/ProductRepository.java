package com.sda.j92.productbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sda.j92.productbackend.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
