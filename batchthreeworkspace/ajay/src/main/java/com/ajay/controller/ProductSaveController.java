package com.ajay.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.dto.Product;

@RestController
@RequestMapping("/addproduct")
public class ProductSaveController {
	
@PostMapping
	public void addProduct(@RequestBody Product product ) {
		
	}
}
