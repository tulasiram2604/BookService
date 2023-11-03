package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
@Autowired
private BookRepository bookRepository;
	public String addBook(Book book)
{
		Book book1=bookRepository.save(book);
		if(book1!=null)
		{
			return "Registered Book Successfully";
		}
	return "Something went Wrong";
}
	public String deleteBook(int id)
	{
		try
		{
		bookRepository.deleteById(id);
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		return "Deleted Successfully";
	}
	public List<Book> getAllBooks()
	{
		List<Book> books=bookRepository.findAll();
		return books;
	}
}
