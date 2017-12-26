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
	
	//书籍分类
	@RequestMapping("/book_cate")
	public String bookCate(HttpServletRequest request) {
		List<BookType> list = bookTypeService.selectAll();
		request.setAttribute("BookTypeList", list);
		return "";
	}
	
	//添加新的分类
	@RequestMapping("bookType_add")
	public String bookTypeAdd(HttpServletRequest request, String name) {
		name = request.getParameter("name");
		BookType bookType = new BookType();
		bookType.setName(name);
		bookTypeService.addBookType(bookType);
		return "";
		
	}
	
	//修改
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
	
	//删除
	public String bookTypeDelete(HttpServletRequest request) {
		String ids = request.getParameter("bookTypeId");
		int id = Integer.parseInt(ids);
		bookTypeService.deleteBookType(id);
		return "";
	}
	
}
