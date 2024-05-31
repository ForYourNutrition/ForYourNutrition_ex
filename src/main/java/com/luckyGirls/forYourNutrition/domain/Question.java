package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Question")
@SuppressWarnings("serial")
public class Question implements Serializable{
	
	 /* Private Fields */
	@Id
	private int question_id;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	private String title;
	private Date qdate;
	private String content;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	/* JavaBeans Properties */
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getQdate() {
		return qdate;
	}
	public void setQdate(Date qdate) {
		this.qdate = qdate;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Question() {
		super();
	}
	public Question(int question_id, Member member, String title, Date qdate, String content, Item item) {
		super();
		this.question_id = question_id;
		this.member = member;
		this.title = title;
		this.qdate = qdate;
		this.content = content;
		this.item = item;
	}
	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", member=" + member + ", title=" + title + ", qdate=" + qdate
				+ ", content=" + content + ", item=" + item + "]";
	}
	
}
