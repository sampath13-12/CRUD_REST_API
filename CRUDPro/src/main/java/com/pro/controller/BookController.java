package com.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.entity.Books;
import com.pro.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bs;

	@GetMapping("/Books")
	List<Books> getBooks() {
		return bs.getBooks();

	}

	@GetMapping("/Books/{id}")
	Books getBookOf(@PathVariable("id") int bid) {
		return bs.getSpecificBook(bid);
	}

	@PostMapping("/Books")
	String insertBook(@RequestBody Books b) {
		return bs.insertBook(b);
	}

	@PutMapping("/Books/{id}")
	String updateBook(@PathVariable("id") int bid, @RequestBody Books b) {
		return bs.updateBook(bid, b);
	}

	@DeleteMapping("/Books/{id}")
	String deleteBook(@PathVariable("id") int bid) {
		return bs.deleteBook(bid);
	}

	@GetMapping("/**")
	String unknownUrl() {
		return "No Such page";
	}

}
