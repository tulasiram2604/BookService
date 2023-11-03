package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/bookService")
public class BookController 
{
	@Autowired
	private BookService bookService;
	@PostMapping("/addBook")
	public String registerBook(@RequestBody Book book)
	{
		String result=bookService.addBook(book);
		return result;
	}
	@DeleteMapping("/deleteBook/{id}")
	public String removeBook(@PathVariable int id)
	{
		String result=bookService.deleteBook(id);
		return result;
	}
	@GetMapping("/getAllbooks")
	public List<Book> getAllBoks()
	{
	 List<Book> books=bookService.getAllBooks();
		return books;
	}
}
