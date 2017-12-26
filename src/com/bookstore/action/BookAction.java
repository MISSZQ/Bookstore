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
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.multipart.MultipartFile;

import com.bookstore.bean.Book;
import com.bookstore.bean.BookType;
import com.bookstore.bean.Page;
import com.bookstore.service.BookService;
import com.bookstore.service.BookTypeService;


@Controller
public class BookAction {
	@Autowired
	private BookService bookService;
	@Autowired
	private BookTypeService bookTypeService;
	
	//列出所有的书籍
	@RequestMapping("/book_list")
	public String booList(Model model,Page page,HttpServletRequest request) {
		String pageS = request.getParameter("page");
		Integer dpage = 1;
		if(pageS!=null) {
			dpage=Integer.parseInt(pageS);
		}
		Page page1 = bookService.getPage();
		page1.setdPage(dpage);
		page1.setTotalCount(bookService.selectCount());
		page1.setPageCount(7);
		page1.setTotalPage();		
		List<Book> list = bookService.bookList();	
		List<BookType> typelist = bookTypeService.selectAll();
		
		model.addAttribute("page", page1);
		model.addAttribute("list", list);
		model.addAttribute("typelist",typelist);
		
		return "admin/book_list";
	}
	
//	//添加新的书籍
//	@RequestMapping("add_book")
//	public String addBook(Model model) {
//		List<BookType> typelist = bookTypeService.selectAll();
//		model.addAttribute("typelist",typelist);
//		return "";
//		
//	}
//	
//	//插入一本书，从书的类别入手
//	@RequestMapping("/book_update")
//	public String bookUpdate(HttpServletRequest request,@RequestParam MultipartFile imgurl)throws IOException{
//		String url = "";
//		String name = imgurl.getName();
//		String originFilename = imgurl.getOriginalFilename();
//		System.out.println("name"+name);
//		System.out.println("originalFilename"+originFilename);
//		if(originFilename!=null && !originFilename.equals("")) {
//			String filename = originFilename.substring(originFilename.lastIndexOf("\\")+1);
//			byte[] bytes = imgurl.getBytes();
//			String realPath = request.getRealPath("/images");
//			System.out.println("realPath:"+realPath);
//			File file = new File(realPath+"/"+filename);
//			url = "images/"+filename;
//			FileOutputStream fos = new FileOutputStream(file);
//			fos.write(bytes);
//			fos.flush();
//			fos.close();
//		}
//		String bookName = request .getParameter("bookName");
//		String type = request.getParameter("bookType");
//		System.out.println(type);
//		String description = request.getParameter("description");
//		String author = request.getParameter("bookAuthor");
//		String prices = request.getParameter("bookPrice");
//		String publisher = request.getParameter("bookPublisher");
//		double price = Double.parseDouble(prices);
//		
//		//插入书的类型
//		List<BookType> typeList = bookTypeService.selectAll();
//		for(BookType it:typeList) {
//			if(it.getName().equals(type)) {
//				Book book = new Book();
//				book.setBookAuthor(author);
//				book.setBookDescription(description);
//				book.setBookImgurl(url);
//				book.setBookName(bookName);
//				book.setBookPublisher(publisher);
//				book.setBookPrice(price);
//				book.setBookType(it);
//				System.out.println(it.getId());
//				bookService.addBook(book);
//				break;
//			}
//		}
//		return "";
//	}
//	
//	//删除书籍
//	@RequestMapping("book_delete")
//	public String deleteBook(int id) {
//		bookService.deleteBook(id);
//		return "";
//	}
//	
//	//书籍的修改
//	@RequestMapping("/before_bookedit")
//	public String beforeEdit(int id,Model model ) {
//		Book book = bookService.selectById(id);
//		List<BookType> typelist = bookTypeService.selectAll();
//		model.addAttribute("typelist",typelist);
//		model.addAttribute("book",book);
//		return "";
//	}
//	@RequestMapping("/bookedit")
//	public String bookEdit(HttpServletRequest request, @RequestParam MultipartFile imgurl) throws IOException {
//		String url = "";
//		String name = imgurl.getName();
//		String originalFilename = imgurl.getOriginalFilename();
//		System.out.println("name"+name);
//		System.out.println("originalFilename"+originalFilename);
//		if(originalFilename!=null && !originalFilename.equals("")) {
//			String filename = originalFilename.substring(originalFilename.lastIndexOf("\\")+1);
//			byte[] bytes = imgurl.getBytes();
//			String realPath = request.getServletContext().getRealPath("/images");
//			System.out.println("realPath:"+realPath);
//			File  file = new File(realPath+"/"+filename);
//			url = "images/"+filename;
//			FileOutputStream fos = new FileOutputStream(file);
//			fos.write(bytes);
//			fos.flush();
//			fos.close();
//		}
//		
//		//通过ID找到Book实体
//		String ids = request.getParameter("ID");
//		int id = Integer.parseInt(ids);
//		Book book = bookService.selectById(id);
//		String bookName = request.getParameter("bookNameame");
//		
//		String type = request.getParameter("booktype");
//		//获取到书籍的分类名（已存在的）
//		//找到并set
//		String description = request.getParameter("description");
//		String author = request.getParameter("bookAuthor");
//		String prices = request.getParameter("bookPrice");
//		String publisher = request.getParameter("bookPublisher");
//		double price = Double.parseDouble(prices);
//		
//		List<BookType> typeList = bookTypeService.selectAll();
//		for(BookType it:typeList) {
//			if(it.getName().equals(type)) {
//				Book book1 = new Book();
//				book1.setBookAuthor(author);
//				book1.setBookDescription(description);
//				book1.setBookImgurl(url);
//				book1.setBookName(bookName);
//				book1.setBookPublisher(publisher);
//				book1.setBookPrice(price);
//				book1.setBookType(it);
//
//				bookService.updateBook(book1);			
//				break;
//			}
//		}		
//		return "";
//	}
//	
//	//批量删除多本图书
//	@RequestMapping("/delete_books")
//	public String deleteBooks(HttpServletRequest request) {
//		String[] ids = request.getParameterValues("checkbook");
//		boolean result = false;
//		for(int i=0;i<ids.length;i++) {
//			int q= Integer.parseInt(ids[i]);
//			boolean flag = bookService.deleteBook(q);
//		}
//		return "";
//	}
}
