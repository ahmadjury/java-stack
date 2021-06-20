package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepositories;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepositories bookRepository;
    
    public BookService(BookRepositories bookRepository) {
        this.bookRepository = bookRepository;
    }
   
    public List<Book> allBooks() {
		 return bookRepository.findAll();	
	}
 
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    public void deletBook(Long id) {
    	bookRepository.deleteById(id);
    }
    
//    public Book updateBook(Book b) {
//        Book newBook = findBook(b.getId());
//        newBook.setTitle(b.getTitle());
//        newBook.setDescription(b.getDescription());
//        newBook.setLanguage(b.getLanguage());
//        newBook.setNumberOfPages(b.getNumberOfPages());
//        return bookRepository.save(newBook);
//    }
//    
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

	public Book updateBook(Long id, String title, String description, Integer numOfPages,String language) {
		  	Book newBook = findBook(id);
	        newBook.setTitle(title);
	        newBook.setDescription(description);
	        newBook.setNumberOfPages(numOfPages);
	        newBook.setLanguage(language);
	        return bookRepository.save(newBook);
		
	}

	
	
}