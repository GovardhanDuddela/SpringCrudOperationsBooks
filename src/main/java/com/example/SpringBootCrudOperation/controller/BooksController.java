package com.example.SpringBootCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCrudOperation.Service.BooksService;
import com.example.SpringBootCrudOperation.model.Books;

@RestController
public class BooksController {
	@Autowired
	BooksService bookservice;
	
	@GetMapping("/book")
	private List<Books> getAllBooks(){
		return bookservice.getAllBooks();	
	}
	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid")int bookid) {
		return bookservice.getBooksById(bookid);	
	}
	@DeleteMapping("/book/{bookid}")
	private void deleteBook(@PathVariable("bookid")int bookid) {
		bookservice.delete(bookid);
	}
	@PostMapping("/books")
		private int saveBook(@RequestBody Books books) {
		bookservice.saveorUpdate(books);
		return books.getBookid();
	}
	@PutMapping("/books")
	private Books update(Books books) {
		bookservice.saveorUpdate(books);
		return books;
	}

}
