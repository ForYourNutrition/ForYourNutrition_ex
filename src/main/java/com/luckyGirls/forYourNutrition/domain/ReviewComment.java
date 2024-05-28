package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ReviewComment implements Serializable{
	
	 /* Private Fields */
	private int rc_id;
	private Review review;
	private Member member;
	private String content;
	private Date rcdate;
	
	/* JavaBeans Properties */

	public int getRc_id() {
		return rc_id;
	}
	public void setRc_id(int rc_id) {
		this.rc_id = rc_id;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRcdate() {
		return rcdate;
	}
	public void setRcdate(Date rcdate) {
		this.rcdate = rcdate;
	}
	
}
