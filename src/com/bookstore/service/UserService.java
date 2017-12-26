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
	
	//用户登录  使用for循环进行遍历
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
	
	//注册
	public boolean register(User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserAddress());
		System.out.println(user.getUserPassword());
		System.out.println(user.getUserTelephone());
		return userDao.insert(user);
	}
	
	//更新用户
	public boolean updateUser(User user) {
		return userDao.update(user);
	}
	
	//删除用户
	public boolean delete(int id) {
		return userDao.delete(id);
	}
	
	//查找所有用户，以列表形式展示
	public List<User> userList(){
		return userDao.select();
	}
	//根据id查找用户
	public User selectById(int id) {
		return userDao.selectUserById(id);
	}
	
	//记录的总条数
	public long selectUserCount() {
		return userDao.selectUserCount();
	}
	//用户搜索功能
	public List<User> selectUser(String userName) {
		return userDao.selectUser(page.getdPage(), page.getPageCount(), userName);
	}

}
