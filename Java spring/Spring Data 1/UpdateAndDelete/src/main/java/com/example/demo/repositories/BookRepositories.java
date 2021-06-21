package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface BookRepositories extends CrudRepository <Book, Long> {
List<Book> findAll();
//List<Book> findByDescriptionContainig(String searsh);
void 	deleteById(ID id);
//Long countByTitleContainig(String searsh);
//Long deleteByTitleStringWith(String searsh);
}
