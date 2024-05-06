package com.example.dockerExample;

import com.example.dockerExample.entity.Product;
import com.example.dockerExample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DockerExampleApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product(null, "first product");
		repository.save(product);
		List<Product> products = repository.findAll();
		System.out.println(products);

	}
}
