package com.bookstore.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.bean.Admin;
import com.bookstore.service.AdminService;

@Controller
public class AdminAction {
	@Autowired
	private AdminService adminService;
	//管理员用户的登录跳转页面
	
	@RequestMapping("/admin_login")
	public String Login(Admin admin,Model model) {
		// TODO Auto-generated method stub
		boolean login = adminService.login(admin);
		if(login == true) {
			return "admin/index";
		}
		
		return "/login.jsp";

	}
	@RequestMapping("/admin_register")
	public String Register(Admin admin,Model model) {
		boolean register = adminService.register(admin);
		return "/success";
	}
}
