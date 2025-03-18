package com.springboot.CRUD_ManyToMany.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;


@Entity
@Data
@Builder
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String imgUrl;
    private Integer quantity;
    private Double price;
    private Boolean isActive;

    // Tạo mối quan hệ với bảng - author
    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name="bookId"),
            inverseJoinColumns = @JoinColumn(name="authorId")
    )
    // Gõ trước rồi @ManyToMany sau.
    private List<Author> authors = new ArrayList<>();
}
