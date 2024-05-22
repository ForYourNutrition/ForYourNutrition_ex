package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
