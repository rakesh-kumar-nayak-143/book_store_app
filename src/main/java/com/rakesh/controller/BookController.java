package com.rakesh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.request.Book;
import com.rakesh.request.Books;

@RestController
public class BookController {

	@GetMapping(value = "/book",produces = {"application/xml","application/json"})
	public ResponseEntity<Books> getBook(){
		List<Book> list=new ArrayList<Book>();
		list.add(new Book(1,"math","100"));
		list.add(new Book(2,"english","200"));
		list.add(new Book(3,"history","300"));
		Books books=new Books();
		books.setBooklist(list);
		return new ResponseEntity<Books>(books, HttpStatus.OK);
	}
	
	@PostMapping(value = "/savebook",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> saveBook(@RequestBody Books books){
		List<Book> booklist = books.getBooklist();
		for (Book book : booklist) {
			System.out.println(book);
		}
		
		return new ResponseEntity<String>("saved successfully", HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
}
