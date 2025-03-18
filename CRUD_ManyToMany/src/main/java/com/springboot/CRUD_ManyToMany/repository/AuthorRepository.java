package com.springboot.CRUD_ManyToMany.repository;

import com.springboot.CRUD_ManyToMany.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
