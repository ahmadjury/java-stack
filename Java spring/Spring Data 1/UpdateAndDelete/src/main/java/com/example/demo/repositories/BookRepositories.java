package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;

@Repository
public interface BookRepositories extends CrudRepository <Book, Long> {
List<Book> findAll();
//List<Book> findByDescriptionContainig(String searsh);

//Long countByTitleContainig(String searsh);
//Long deleteByTitleStringWith(String searsh);
}
