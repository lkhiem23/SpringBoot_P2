package com.springboot.CRUD_ManyToMany.repository;

import com.springboot.CRUD_ManyToMany.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
