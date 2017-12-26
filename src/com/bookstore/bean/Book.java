package com.bookstore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue
	@Column(name="book_id")
	private int bookId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_price")
	private Double bookPrice;	
	
	@Column(name="book_author")
	private String bookAuthor;
	@Column(name="book_description")
	private String bookDescription;
	@Column(name="book_publisher")
	private String bookPublisher;
	@Column(name="book_imgurl")
	private String bookImgurl;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private BookType bookType;
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookImgurl() {
		return bookImgurl;
	}
	public void setBookImgurl(String bookImgurl) {
		this.bookImgurl = bookImgurl;
	}
	
	
	

}
