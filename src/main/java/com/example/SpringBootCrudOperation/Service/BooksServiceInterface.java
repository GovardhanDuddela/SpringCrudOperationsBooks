package com.example.SpringBootCrudOperation.Service;

import java.awt.print.Book;
import java.util.List;

import com.example.SpringBootCrudOperation.model.Books;

public interface BooksServiceInterface {
	public List<Books> getAllBooks();
	public Books getBooksById(int id);
	public void saveorUpdate(Books books);
	public void delete(int id);
	public void update(Books books,int id);
}
