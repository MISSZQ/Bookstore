package com.bookstore.action;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.bean.BookType;
import com.bookstore.service.BookService;
import com.bookstore.service.BookTypeService;
import com.sun.xml.internal.bind.v2.runtime.Name;

@Controller
public class BookTypeAction {
	@Autowired
	private BookTypeService bookTypeService;
	
	//�鼮����
	@RequestMapping("/book_cate")
	public String bookCate(HttpServletRequest request) {
		List<BookType> list = bookTypeService.selectAll();
		request.setAttribute("BookTypeList", list);
		return "";
	}
	
	//����µķ���
	@RequestMapping("bookType_add")
	public String bookTypeAdd(HttpServletRequest request, String name) {
		name = request.getParameter("name");
		BookType bookType = new BookType();
		bookType.setName(name);
		bookTypeService.addBookType(bookType);
		return "";
		
	}
	
	//�޸�
	@RequestMapping("bookTypeEdit")
	public String bokTypeEdit(HttpServletRequest request) {
	String ids = request.getParameter("ID");
	int id  = Integer.parseInt(ids);
	String name = request.getParameter("name");
	bookTypeService.updateBookType(id, name);
	return "";
	}
	@RequestMapping("update_before")
	public String bookUpdateBefore(HttpServletRequest request) {
		String ids = request.getParameter("bookTypeId");
		int id = Integer.parseInt(ids);
		BookType bookType = bookTypeService.selectById(id);
		request.setAttribute("bookType", bookType);
		return "";
	}
	
	//ɾ��
	public String bookTypeDelete(HttpServletRequest request) {
		String ids = request.getParameter("bookTypeId");
		int id = Integer.parseInt(ids);
		bookTypeService.deleteBookType(id);
		return "";
	}
	
}
