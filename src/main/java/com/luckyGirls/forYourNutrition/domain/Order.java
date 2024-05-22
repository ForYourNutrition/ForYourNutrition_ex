package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order {
	  /*기본적으로 가지고 있어야 할 ID*/
	  private int orderId;
	  private int memberId;
	  
	  /*주문에 필요한 정보들*/
	  private String username;
	  private Date orderDate;
	  private Address address;
	  
	  private double totalPrice;
	  
	  /*주문하는 사람 이름*/
	  private String billToFirstName;
	  private String billToLastName;
	  
	  /*배송받을 사람이름*/
	  private String shipToFirstName;
	  private String shipToLastName;
	  
	  /*결제 수단(카드) 정보*/
	  private String creditCard;
	  private String expiryDate;
	  /*cardType 까지 필요한지는 모르겠으나 예제에 있어서 일단 추후에 수정 예정*/
	  private String cardType;
	  
	  /*주문 상태*/
	  private int status;
	  private List<OrderItem> orderItems = new ArrayList<OrderItem>();

	  /* JavaBeans Properties */

	  public int getOrderId() { return orderId; }
	  public void setOrderId1(int orderId) { this.orderId = orderId; }
	  
	  public int getMemberId() {return memberId;}
	  public void setMemberId(int memberId) {this.memberId = memberId;}

	  public String getUsername() { return username; }
	  public void setUsername(String username) { this.username = username; }

	  public Date getOrderDate() { return orderDate; }
	  public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

	  public Address getAddress() {return address;}
	  public void setAddress(Address address) {this.address = address;}

	  public double getTotalPrice() { return totalPrice; }
	  public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

	  public String getBillToFirstName() { return billToFirstName; }
	  public void setBillToFirstName(String billToFirstName) { this.billToFirstName = billToFirstName; }

	  public String getBillToLastName() { return billToLastName; }
	  public void setBillToLastName(String billToLastName) { this.billToLastName = billToLastName; }

	  public String getShipToFirstName() { return shipToFirstName; }
	  public void setShipToFirstName(String shipFoFirstName) { this.shipToFirstName = shipFoFirstName; }

	  public String getShipToLastName() { return shipToLastName; }
	  public void setShipToLastName(String shipToLastName) { this.shipToLastName = shipToLastName; }

	  public String getCreditCard() { return creditCard; }
	  public void setCreditCard(String creditCard) { this.creditCard = creditCard; }

	  public String getExpiryDate() { return expiryDate; }
	  public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

	  public String getCardType() { return cardType; }
	  public void setCardType(String cardType) { this.cardType = cardType; }

	  public int getStatus() { return status; }
	  public void setStatus(int status) { this.status = status; }

	  public void setLineItems(List<OrderItem> lineItems) { this.orderItems = orderItems; }
	  public List<OrderItem> getLineItems() { return orderItems; }

	  /* 카트 -> 주문으로 넘기는 method 카트 구현, member 구현에 따라 수정되기 떄문에 일단 냅두겠음 
	  public void initOrder(Member member, Cart cart) {
	    username = member.getUsername();
	    orderDate = new Date();

	    shipToFirstName = member.getFirstName();
	    shipToLastName = member.getLastName();
	    address = member.getAddress();

	    billToFirstName = member.getFirstName();
	    billToLastName = member.getLastName();

	    totalPrice = cart.getSubTotal();

	    creditCard = "999 9999 9999 9999";
	    expiryDate = "12/03";
	    cardType = "Visa";
	
	    status = 0;

	    Iterator<CartItem> i = cart.getAllCartItems();
	    while (i.hasNext()) {
	      CartItem cartItem = (CartItem) i.next();
	      addOrderItem(cartItem);
	    }
	  }
	  
	  
	  public void addOrderItem(CartItem cartItem) {
	    OrderItem orderItem = new OrderItem(orderItems.size() + 1, cartItem);
	    addOrderItem(orderItem);
	  }
	  */

	  /*orderItems에 orderItem 추가 method*/
	  public void addOrderItem(OrderItem orderItem) {
	    orderItems.add(orderItem);
	  }
}
