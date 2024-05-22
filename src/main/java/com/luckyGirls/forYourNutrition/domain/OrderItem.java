package com.luckyGirls.forYourNutrition.domain;

public class OrderItem {
	private int orderItemId;
	private int orderId;
	private int itemId;
	private int quantity;
	/*Item 한개에 대한 가격 - unit*quantity로 sub구할 것임*/
	private double unitPrice;

	/*생성자*/
	public OrderItem() {}

	/*orderItem_id 는 자동 생성될 것인데 cart 구현자와 맞춰서 재수정 예정
	public OrderItem(int orderId, CartItem cartItem) {
	   this.orderId = orderId;
	   this.quantity = cartItem.getQuantity();
	   this.item_id = cartItem.getItem().getItemId();
	   this.unitPrice = cartItem.getItem().getUnitPrice();
	  }
	 */
	
	  /* JavaBeans Properties */
	  public int getOrderItemId() {return orderItemId;}
	  public void setOrderItemId(int orderItemId) {this.orderItemId = orderItemId;}

	  public int getOrderId() { return orderId; }
	  public void setOrderId(int orderId) { this.orderId = orderId; }

	  public int getItemId() { return itemId; }
	  public void setItemId(int itemId) { this.itemId = itemId; }

	  public double getUnitPrice() { return unitPrice; }
	  public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

	  public int getQuantity() { return quantity; }
	  public void setQuantity(int quantity) {
	    this.quantity = quantity;
	  }

	  public double getSubPrice() {
		return this.unitPrice * this.quantity;
	  }
}
