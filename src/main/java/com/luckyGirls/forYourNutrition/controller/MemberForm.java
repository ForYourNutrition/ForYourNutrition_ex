package com.luckyGirls.forYourNutrition.controller;

import java.util.Date;

public class MemberForm {
	private String id;
	private String password;
	private String passwordCheck;
	private String name;
	private String nickname;
	private Date birth;
	private int gender;
	private String phone_number;
	private String email;
	private int point;
	private int taking_time;
  
	/* JavaBeans Properties */
  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getTaking_time() {
		return taking_time;
	}
	public void setTaking_time(int taking_time) {
		this.taking_time = taking_time;
	} 
}
