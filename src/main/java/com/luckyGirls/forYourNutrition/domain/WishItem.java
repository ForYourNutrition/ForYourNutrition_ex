package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;

import jakarta.persistence.Table;

@Table(name = "WishItem")
public class WishItem implements Serializable{
	private int wish_id;
	private Member member;
	private Item item;
	
	/* JavaBeans Properties */
	
	public int getWish_id() {
		return wish_id;
	}
	public void setWish_id(int wish_id) {
		this.wish_id = wish_id;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
