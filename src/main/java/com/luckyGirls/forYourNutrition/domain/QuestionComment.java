package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class QuestionComment implements Serializable{
	
	 /* Private Fields */
	@Id
	private int qc_id;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;
	
	private String content;
	private Date qcdate;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	
	/* JavaBeans Properties */
	
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
	public Date getQcdate() {
		return qcdate;
	}
	public void setQcdate(Date qcdate) {
		this.qcdate = qcdate;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
		
	public QuestionComment() {
		super();
	}
	public QuestionComment(int qc_id, Question question, String content, Date qcdate, Member member) {
		super();
		this.qc_id = qc_id;
		this.question = question;
		this.content = content;
		this.qcdate = qcdate;
		this.member = member;
	}
	@Override
	public String toString() {
		return "QuestionComment [qc_id=" + qc_id + ", question=" + question + ", content=" + content + ", qcdate="
				+ qcdate + ", member=" + member + "]";
	}
}
