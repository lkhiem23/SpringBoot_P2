package com.lesson07.CRUD_OneToMany_DB.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="products")
@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String productName;
    String imageUrl;
    Integer quantity;
    Double price;
    Boolean status;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    Category category;
}
