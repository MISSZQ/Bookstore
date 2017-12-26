package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.bean.BookType;
import com.bookstore.dao.BookTypeDao;
import com.sun.org.apache.regexp.internal.recompile;

@Service
@Transactional
public class BookTypeService {
	@Autowired
	private BookTypeDao bookTypeDao;
	
	
	//添加
	public boolean addBookType(BookType bookType) {
		return bookTypeDao.insert(bookType);
	}
	
	//删除
	public boolean deleteBookType(int id) {
		return bookTypeDao.delete(id);
	}
	
	//更新
	public boolean updateBookType(int id, String name) {
		return bookTypeDao.update(id,name);
	}
	
	public boolean update(BookType bookType) {
		return bookTypeDao.update(bookType);
	}
	
	//查找所有种类
	public List<BookType> selectAll(){
		return bookTypeDao.select();
	}
	
	//根据名字查找
	public BookType selectById(int id) {
		return bookTypeDao.selectById(id);
	}
}
