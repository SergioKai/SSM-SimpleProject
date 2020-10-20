package com.sergio.dao;

import com.sergio.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") Integer id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId") Integer id);

    //查询全部的书
    List<Books> queryAllBooks();

    //通过书名查书
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
