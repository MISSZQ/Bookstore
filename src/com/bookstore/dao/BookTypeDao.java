package com.bookstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookstore.bean.BookType;

@Repository
public class BookTypeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	//����id����ʵ��
	public BookType selectById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from BookType where id=?");
		query.setParameter(0, id);
		BookType bookType = (BookType) query.uniqueResult();
		return bookType;
	}
	
	//�������е�����
	public List<BookType> select(){
		Session session = sessionFactory.getCurrentSession();
		Query query =session .createQuery("from BookType");
		List<BookType> list =query.list();
		return list;
	}
	
	//����µ��鼮����
	public boolean insert(BookType bookType) {
		Session session = sessionFactory.getCurrentSession();
		session.save(bookType);
		return true;
		
	}
	
	//����
	public boolean update(BookType bookType) {
		Session session = sessionFactory.getCurrentSession();
		session.update(bookType);
		return true;
	}
	
	//ɾ��
	public boolean delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from BookType where id=?");
		query.setParameter(0, id);
		int executeUpdate = query.executeUpdate();
		return true;
	}
	
	//ͨ��id�����޸�name
	public boolean update(int id,String name) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update BookType set name=? where id=?");
		query.setParameter(0, name);
		query.setParameter(1, id);
		int excuteUpdate = query.executeUpdate();
		return true;
	}
}
