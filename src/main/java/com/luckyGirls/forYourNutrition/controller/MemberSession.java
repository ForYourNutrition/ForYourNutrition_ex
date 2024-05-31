package com.luckyGirls.forYourNutrition.controller;

import java.io.Serializable;

import com.luckyGirls.forYourNutrition.domain.Member;

@SuppressWarnings("serial")
public class MemberSession implements Serializable {
	
	private Member member;

	public MemberSession(Member member) {
		this.member = member;
	}

	public Member getMember() {
		return member;
	}
}