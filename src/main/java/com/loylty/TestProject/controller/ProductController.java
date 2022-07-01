package com.loylty.TestProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loylty.TestProject.entity.Product;

@RestController
public class ProductController {
	
	
	/* Types of APIs */
	
	@GetMapping("/getProduct")
	public Product getProduct() {
		return new Product();
	}
	
	
	

}
