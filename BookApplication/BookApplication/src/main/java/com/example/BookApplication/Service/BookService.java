package com.example.BookApplication.Service;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book) {
       return  bookRepository.save(book);

    }

    public Book getBookByName(String name) {
        Book book = bookRepository.findBookByTitle(name);
        if (book == null) {
            throw new RuntimeException("Book not found with title: " + name);
        }
        return book;
    }

    public Book updateBook(Book book) {
       return  bookRepository.save(book);
    }


    public Book deleteBook(Integer id) {
        bookRepository.deleteById(id);
        return null;
    }
}
