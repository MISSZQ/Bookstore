package com.bookstore.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bean.Page;
import com.bookstore.bean.User;
import com.bookstore.dao.UserDao;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private Page page;
	
	public Page getPage() {
		return page;
	}
	public void setPage() {
		this.page = page;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//�û���¼  ʹ��forѭ�����б���
	public User login(User user) {
		List<User> list = userDao.select();				
		String username = user.getUserName();		
		String password  = user.getUserPassword();
		System.out.println(username);
		System.out.println(password);
		for(int i=0;i<list.size();i++) {
			String username1 = user.getUserName();
			String password1 = user.getUserPassword();
			if(username.equals(username1) && password.equals(password1)) {
				return user;
			}						
		}
		return null;
		
	}
	
	//ע��
	public boolean register(User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserAddress());
		System.out.println(user.getUserPassword());
		System.out.println(user.getUserTelephone());
		return userDao.insert(user);
	}
	
	//�����û�
	public boolean updateUser(User user) {
		return userDao.update(user);
	}
	
	//ɾ���û�
	public boolean delete(int id) {
		return userDao.delete(id);
	}
	
	//���������û������б���ʽչʾ
	public List<User> userList(){
		return userDao.select();
	}
	//����id�����û�
	public User selectById(int id) {
		return userDao.selectUserById(id);
	}
	
	//��¼��������
	public long selectUserCount() {
		return userDao.selectUserCount();
	}
	//�û���������
	public List<User> selectUser(String userName) {
		return userDao.selectUser(page.getdPage(), page.getPageCount(), userName);
	}

}
