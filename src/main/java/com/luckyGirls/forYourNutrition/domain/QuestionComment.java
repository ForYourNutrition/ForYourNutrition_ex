package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionComment implements Serializable{
	private int qc_id;
	private Question question;
	private String content;
	private Date qdate;
}
