package com.bookstore.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity				//用户的实体类
@Table(name="user")   //实体类对应数据库中的表名
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_Id;
	@Column(name="user_username")
	private String userName;
	@Column(name="user_password")
	private String userPassword;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_telephone")
	private int userTelephone;
	@Column(name="user_address")
	private String userAddress;
	@Column(name="user_imgurl")
	private String userImgurl;
	@Column(name="user_posttime")
	private Date postTime;
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public String getUserImgurl() {
		return userImgurl;
	}
	public void setUserImgurl(String userImgurl) {
		this.userImgurl = userImgurl;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserTelephone() {
		return userTelephone;
	}
	public void setUserTelephone(int userTelephone) {
		this.userTelephone = userTelephone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_id) {
		this.user_Id = user_Id;
	}
	
	

}

