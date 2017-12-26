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
	
	
	//���
	public boolean addBookType(BookType bookType) {
		return bookTypeDao.insert(bookType);
	}
	
	//ɾ��
	public boolean deleteBookType(int id) {
		return bookTypeDao.delete(id);
	}
	
	//����
	public boolean updateBookType(int id, String name) {
		return bookTypeDao.update(id,name);
	}
	
	public boolean update(BookType bookType) {
		return bookTypeDao.update(bookType);
	}
	
	//������������
	public List<BookType> selectAll(){
		return bookTypeDao.select();
	}
	
	//�������ֲ���
	public BookType selectById(int id) {
		return bookTypeDao.selectById(id);
	}
}
