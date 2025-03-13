package com.springboot_lesson06.CRUD.responsitory;

import com.springboot_lesson06.CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResponsitory extends JpaRepository<Student, Long> {
}
