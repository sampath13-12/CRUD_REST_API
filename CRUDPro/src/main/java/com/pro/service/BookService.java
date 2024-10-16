package com.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pro.entity.Books;
import com.pro.repository.BookRepository;

@Component
public class BookService {
	@Autowired
	private BookRepository br;

	public List<Books> getBooks() {
		return (List<Books>) br.findAll();
	}

	public Books getSpecificBook(int bid) {
		return br.findById(bid);
	}

	public String insertBook(Books b) {
		br.save(b);
		return "Book inserted successfully";
	}

	public String updateBook(int bid, Books b) {
		if (br.findById(bid) != null) {
			br.save(b);
			return "Updated successfully";
		} else {
			return "No such Book";
		}

	}

	public String deleteBook(int bid) {
		br.delete(br.findById(bid));
		return "Book deleted successfully";
	}

}
