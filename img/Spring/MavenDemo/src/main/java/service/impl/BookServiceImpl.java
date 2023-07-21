package service.impl;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import service.BookService;

public class BookServiceImpl implements BookService {
//    5.删除业务层中使用new的方法创建的dao对象
    public BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
//    6.提供对应的set方法
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
}
