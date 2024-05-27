package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable{
	 /* Private Fields */
	private int review_id;
	//private Member member;
	//private Item item;
	private String title;
	private Date rdate;
	private String content;
	private String img;
	private int rate;
	
	/* JavaBeans Properties */
	
	
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
