package com.namhkse.springboot_rest.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.namhkse.springboot_rest.model.Book;

public interface BookService {

    public List<Book> findAll();

    public Optional<Book> findById(Long id);

    public Book save(Book book);

    public void deleteById(Long id);

    public List<Book> findByTitle(String title);

    public List<Book> findByPublishedDateAfter(LocalDate date);
}
