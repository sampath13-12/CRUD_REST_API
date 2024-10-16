package com.pro.repository;

import org.springframework.data.repository.CrudRepository;

import com.pro.entity.Books;

public interface BookRepository extends CrudRepository<Books, Integer> 
{
	Books findById(int bid);
}
