package com.springboot.CRUD_ManyToMany.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "authors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String imgUrl;
    private String email;
    private String phone;
    private String address;
    private Boolean isActive;

    @Transient // Không lưu vào bảng `author`, chỉ dùng để xử lý tạm thời
    private boolean isEditor;
    
    // Tạo mối quan hệ với bảng Book
    @ManyToMany(mappedBy = "authors")

    List<Book> books = new ArrayList<>();

}
