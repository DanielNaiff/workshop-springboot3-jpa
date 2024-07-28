package com.danielnaiff.course.repositories;

import com.danielnaiff.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
