package com.lesson07.CRUD_OneToMany_DB.responsitory;

import com.lesson07.CRUD_OneToMany_DB.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
