package com.danielnaiff.course.repositories;

import com.danielnaiff.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
