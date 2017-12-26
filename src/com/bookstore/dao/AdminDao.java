package com.bookstore.dao;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.bean.Admin;

@Repository
public class AdminDao {
	@Autowired
	private SessionFactory sessionFactory;
	//admin��ѯ
	public List<Admin> select(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Admin");
		List<Admin> list = query.list();
		return list;
	}
	//����
	public boolean insert(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		session.save(admin);
		return true;
	}
	//ɾ��
	public boolean delete(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(admin);
		return true;
	}
	//����
	public boolean update(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		session.update(admin);
		return true;
		
	}

}
