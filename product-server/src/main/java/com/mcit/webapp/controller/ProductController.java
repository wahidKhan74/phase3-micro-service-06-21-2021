package com.mcit.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcit.webapp.entity.Product;

@RestController
public class ProductController {

	@GetMapping("/products")
	List<Product> listAccount() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "Dell Laptop"));
		list.add(new Product(102, "Lenovo Laptop"));
		list.add(new Product(103, "Apple Laptop"));
		return list;
	}
}
