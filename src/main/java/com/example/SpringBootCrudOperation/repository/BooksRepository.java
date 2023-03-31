package com.example.SpringBootCrudOperation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCrudOperation.Service.BooksService;
import com.example.SpringBootCrudOperation.model.Books;


public interface BooksRepository extends CrudRepository<Books, Integer> {
	

}
