package com.bookstore.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bean.Admin;
import com.bookstore.dao.AdminDao;

@Service
@Transactional
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	
	//����Ա�ĵ�¼  
	public boolean login(Admin admin) {		
		// TODO Auto-generated method stub
		List<Admin> list = adminDao.select();
		
		String adminname = admin.getAdminName();
		String password = admin.getAdminPassword();
		System.out.println(adminname);
		System.out.println(password);
		for(int i=0;i<list.size();i++) {
			String adminname1 = admin.getAdminName();
			String password1 = admin.getAdminPassword();
			if(adminname.equals(adminname1) && password.equals(password1)) {		
				return true;
			}	
		}	
		return false;
	
}	
	
	
	//����µĹ���Ա
	public boolean register(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.insert(admin);

	}

}

