package com.danielnaiff.course.repositories;

import com.danielnaiff.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
