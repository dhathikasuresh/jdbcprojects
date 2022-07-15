package com.ajay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajay.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
