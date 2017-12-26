package com.bookstore.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookstore.bean.User;
@Repository
@Transactional
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	//��ѯuser
	public List<User> select(){
		Session session = (Session) sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		return list;
		
	}
	//����
	public boolean insert(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return true;
	}
	
	//ɾ��
	public boolean delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from User where user_Id =?");
		query.setParameter(0, id);
		int executeUpdate = query.executeUpdate();
		//session.delete(user);
		return true;
	}
	
	//����
	public boolean update(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		return true;
	}
	
	//�����û�id�����û�
	public User selectUserById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where user_Id=?");
		query.setParameter(0, id);
		return (User) query.uniqueResult();	
	}
	//��ѯ�û�������
	public long selectUserCount() {
				Session session = sessionFactory.getCurrentSession();
				Query query = session.createQuery("select count(*) from User");
				return (long) query.uniqueResult();
	}
	//����
	public List<User> selectUser(int dpage,int pageCount,String userName) { 
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where userName like :userName");
		query.setParameter("userName", "%"+userName+"%");
		query.setFirstResult((dpage-1)*pageCount);
		query.setMaxResults(pageCount);
		List<User> list = (List<User>)query.list();
		return list;
	}
	

}
