package com.luckyGirls.forYourNutrition.domain;

public class Delivery {
	private int deliveryId;
	private int orderId;
	private int memberId;
	private Address address;
	private int status;
	
	
	public int getDeliveryId() { return deliveryId; }
	public void setDeliveryId(int deliveryId) { this.deliveryId = deliveryId; }
	
	public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public int getmemberId() {return memberId;}
    public void setMemberId(int memberId) {this.memberId = memberId;}
    
    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}
    
    public int getStatus() {return status;}
    public void setStatus(int status) {this.status = status;}
}
