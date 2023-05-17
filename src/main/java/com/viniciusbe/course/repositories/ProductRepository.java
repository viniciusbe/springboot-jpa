package com.viniciusbe.course.repositories;

import com.viniciusbe.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
