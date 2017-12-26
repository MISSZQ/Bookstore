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
	
	//根据id查找实体
	public BookType selectById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from BookType where id=?");
		query.setParameter(0, id);
		BookType bookType = (BookType) query.uniqueResult();
		return bookType;
	}
	
	//查找所有的类型
	public List<BookType> select(){
		Session session = sessionFactory.getCurrentSession();
		Query query =session .createQuery("from BookType");
		List<BookType> list =query.list();
		return list;
	}
	
	//添加新的书籍类型
	public boolean insert(BookType bookType) {
		Session session = sessionFactory.getCurrentSession();
		session.save(bookType);
		return true;
		
	}
	
	//更新
	public boolean update(BookType bookType) {
		Session session = sessionFactory.getCurrentSession();
		session.update(bookType);
		return true;
	}
	
	//删除
	public boolean delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from BookType where id=?");
		query.setParameter(0, id);
		int executeUpdate = query.executeUpdate();
		return true;
	}
	
	//通过id进行修改name
	public boolean update(int id,String name) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update BookType set name=? where id=?");
		query.setParameter(0, name);
		query.setParameter(1, id);
		int excuteUpdate = query.executeUpdate();
		return true;
	}
}
