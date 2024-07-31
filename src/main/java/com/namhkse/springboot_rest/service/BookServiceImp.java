package com.namhkse.springboot_rest.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.namhkse.springboot_rest.mapper.BookMapper;
import com.namhkse.springboot_rest.model.Book;

@Service
public class BookServiceImp implements BookService {

    private final BookMapper bookMapper;

    public BookServiceImp(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return null;
    }

    @Override
    public Book save(Book book) {
        long id = (long) bookMapper.save(book);
        // book.setId(id);
        return book;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public List<Book> findByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByTitle'");
    }

    @Override
    public List<Book> findByPublishedDateAfter(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPublishedDateAfter'");
    }
}
