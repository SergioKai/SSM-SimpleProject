package com.sergio.service;

import com.sergio.pojo.Books;

import java.util.List;

//BookService:底下需要去实现,调用dao层
public interface BookService {
    //增加一本书
    int addBook(Books book);

    //根据id删除一本书
    int deleteBookById(Integer id);

    //更新一本书
    int updateBook(Books books);

    //根据id查询一本书
    Books queryBookById(Integer id);

    //查询全部书
    List<Books> queryAllBook();

    List<Books> queryBookByName(String bookName);
}
