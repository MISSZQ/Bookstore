package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.bean.Book;
import com.bookstore.bean.Page;
import com.bookstore.dao.BookDao;
import com.sun.org.apache.regexp.internal.recompile;

@Service
@Transactional
public class BookService {
	@Autowired
	private Page page;
	@Autowired
	private BookDao bookDao;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public BookDao getBookDao() {
		return bookDao;
	}
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	//�������еļ�¼����
	public long selectCount() {
		return bookDao.selectCount();
	}
	//��ѯ���е��鼮
	public List<Book> bookList(){
		return bookDao.selectByPage(page.getdPage(), page.getPageCount());
	}
	//����µ�ͼ��
	public boolean addBook(Book book) {
		return bookDao.insert(book);
	}
	//ɾ��ͼ��
	public boolean deleteBook(int id) {
		return bookDao.delete(id);
	}
	//�޸�ͼ����Ϣ
	public boolean updateBook(Book book) {
		return bookDao.update(book);
	}
	//����id����ͼ��
	public Book selectById(int id){
		// TODO Auto-generated method stub
		return bookDao.selectById(id);
	}
	
	
}
