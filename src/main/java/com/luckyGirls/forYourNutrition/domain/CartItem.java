package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;

public class CartItem implements Serializable {
	
	/* Private Fields */
	
	private int cart_id;
	private Member member;
	private Item item;
	private int quantity;
	public int getCart_id() {
		return cart_id;
	}
	
	/* JavaBeans Properties */
	
	
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
}
