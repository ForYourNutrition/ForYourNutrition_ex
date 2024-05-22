package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question implements Serializable{
	private int question_id;
	private Member member;
	private Item item;
	private String title;
	private Date rdate;
	private String content;

}
