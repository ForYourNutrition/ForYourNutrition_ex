package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewComment implements Serializable{
	
	private int rc_id;
	private Review review;
	private Member member;
	private String content;
	private Date rdate;
}
