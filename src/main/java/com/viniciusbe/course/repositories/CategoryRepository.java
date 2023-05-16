package com.viniciusbe.course.repositories;

import com.viniciusbe.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
