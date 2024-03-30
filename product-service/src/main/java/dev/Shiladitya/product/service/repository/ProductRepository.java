package dev.Shiladitya.product.service.repository;

import dev.Shiladitya.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
