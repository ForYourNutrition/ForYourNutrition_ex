package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Question implements Serializable{
	private int question_id;
	private Member member;
	private String title;
	private Date qdate;
	private String content;
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRdate() {
		return qdate;
	}
	public void setRdate(Date rdate) {
		this.qdate = rdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
}
