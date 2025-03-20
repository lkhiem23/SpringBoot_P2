package com.springboot.CRUD_ManyToMany.controller;

import com.springboot.CRUD_ManyToMany.entity.Book;
import com.springboot.CRUD_ManyToMany.service.AuthorService;
import com.springboot.CRUD_ManyToMany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

//    private static final String UPLOAD_DIR = "src/main/resource/static/";
//    private static final String UPLOAD_PathFile="images/products";

    // Hiển thị toàn bộ sách
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books/book_list";
    }

    // Thêm mới sách
    @GetMapping("/new")
    public String showCreateBookForm(Model model) {
        model.addAttribute("books", new Book());
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book_form";
    }

    //Submit New Book
    @PostMapping("/new")
    public String saveBook(@ModelAttribute Book book){
        // Form xử lí thêm mới


        return "redirect:/books/";
    }
}
