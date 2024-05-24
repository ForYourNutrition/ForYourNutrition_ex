package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class QuestionComment implements Serializable{
	private int qc_id;
	private Question question;
	private String content;
	private Date qcdate;
	
	public int getQc_id() {
		return qc_id;
	}
	public void setQc_id(int qc_id) {
		this.qc_id = qc_id;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getQdate() {
		return qcdate;
	}
	public void setQdate(Date qdate) {
		this.qcdate = qdate;
	}
	
	
}
