package com.bookstore.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bookstore.bean.Page;
import com.bookstore.bean.User;
import com.bookstore.service.UserService;

@Controller
public class UserAction {
	@Autowired
	private UserService userService;
	//�����û���������󣬵����¼�ɹ������ת��ҳ��
	@RequestMapping("/user_login")  
	public String Login(User user,Model model, HttpServletRequest request) {
		//System.out.println(user.getUserTelephone());
		
		User user1 = userService.login(user);
		if(user1!=null) {
			request.getSession().setAttribute("user", user1);
			return "BookStore/index";
		}
		return "BookStore/login";
	}
	
	//�û�ע��
	@RequestMapping("/user_register")
	public String Register(User user,Model model) {
		boolean reinsert = userService.register(user);
		if(reinsert) {			
			return "BookStore/login";
		}
		return "BookStore/register";
	}
	
	//�û��ں�̨���б����ʽչʾ
	@RequestMapping("/user_list")
	public String userList(HttpServletRequest request,Page page) {
		List<User> userList = userService.userList();
		String pageS = request.getParameter("page");
		Integer dpage = 1;
		System.out.println(request.getParameter(pageS));
		if(pageS!=null) {
			dpage = Integer.parseInt(pageS);
		}
		Page page1 = userService.getPage();
		page1.setdPage(dpage);
		page1.setTotalCount(userService.selectUserCount());
		page1.setPageCount(7);
		page1.setTotalPage();
		
		request.setAttribute("page", page1);
		request.setAttribute("list", userList);
		return "admin/cat_manage";
	}
	
	//�û���Ϣ�ı༭���޸�
	@RequestMapping("/user_update")
	public String userUpdate(HttpServletRequest request) {
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		User user = userService.selectById(id);
		request.setAttribute("user", user);		
		return "admin/user_update";
	}
	
	//�û��޸���Ϣ����ת��cat_manage.jsp
	@RequestMapping("/user_update_submit")
	public String updateSubmit(@RequestParam MultipartFile imgurls, User user,HttpServletRequest request)throws IOException{
//		if(imgurls!=null) {
//			System.out.println(user.getUser_Id());
//			System.out.println(user.getUserImgurl());
//		}
		System.out.println("gggggggg");
		String url = "";
		String name = imgurls.getName();
		String ofn = imgurls.getOriginalFilename();
		if(ofn!=null && !ofn.equals(user.getUserImgurl())) {
			String filename = ofn.substring(ofn.lastIndexOf("\\")+1);
			byte[] bytes = imgurls.getBytes();
			String realPath = request.getServletContext().getRealPath("BookStore/images");
			System.out.println("realPath:"+"/"+realPath);
			File file = new File(realPath+"/"+filename);
			url = "BookStore/images/"+filename;
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(bytes);
			fos.flush();
			fos.close();
			
		}
		user.setUserImgurl(url);
		userService.updateUser(user);
		return "user_list.do";
	}
	
	//ɾ�������û�
	@RequestMapping("/user_deleteone")
	public String deleteUser(HttpServletRequest request,User user) {
		String ids = request.getParameter("id");
		System.out.println(user.getUser_Id());
		int id = Integer.parseInt(ids);
		userService.delete(id);
		return "redirect:user_list.do";
	}
	
	
	//һ����ɾ������û�
	//@RequestMapping("/user_deletemore")
//	public String deleteUsers(HttpServletRequest request) {
//		String[] ids = request.getParameterValues("ss");
//		System.out.println(ids);
//		boolean result = false;
//		for(int i=0;i<ids.length;i++) {
//			int ss = Integer.parseInt(ids[i]);
//			userService.delete(ss);
//		}
//		return "redirect:user_list.do";
//	}
	
}
