package com.namhkse.springboot_rest.mapper;

import com.namhkse.springboot_rest.model.Book;
import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    // @Select("SELECT * FROM users WHERE id = #{userId}")
    // User getUser(@Param("userId") String userId);

    // @Select("SELECT * FROM book WHERE title = ${title}")
    // List<Book> findByTitle(@Param("title") String title);

    // @Select("SELECT * FROM book WHERE publishDate > ${date}")
    // List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);

    @Select("SELECT *, publish_date AS publishDate FROM book")
    public List<Book> findAll();

    // @Select("SELECT * FROM book WHERE title = '-1'")
    // public Book findById(Long id);

    @Insert("INSERT INTO book (title, author, publish_date) VALUES (#{title}, #{author}, #{publishDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int save(Book book);

    // @Select("SELECT * FROM book WHERE title = '-1'")
    // public void deleteById(Long id);

}