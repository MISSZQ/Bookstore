package com.bookstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.bean.Book;
import com.sun.org.apache.regexp.internal.recompile;

@Transactional
@Repository
public class BookDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	//查询所有的书籍
	public List<Book> selectByPage(int dpage,int pageCount){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Book");
		query.setFirstResult((dpage-1)*pageCount);
		query.setMaxResults(pageCount);
		List<Book> list = query.list();
		return list;
	}
	//添加新的图书
	public boolean insert(Book book ) {
		Session session = sessionFactory.getCurrentSession();
		session.save(book);
		return true;
	}
	//对图书进行删除操作
	public boolean delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Book");
		query.setParameter(0, id);
		int executeUpdate = query.executeUpdate();
		return true;
	}
	//对图书信息进行修改
	public boolean update(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.update(book);
		return true;
	}
	//根据id查找实体
	public Book selectById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Book b where b.id=?");
		query.setParameter(0, id);
		Book book = (Book) query.uniqueResult();
		return book;
	}
	//查询所有记录的总和
	public long selectCount() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select count(*) from Book");
		return (long) query.uniqueResult();
	}
	
}
