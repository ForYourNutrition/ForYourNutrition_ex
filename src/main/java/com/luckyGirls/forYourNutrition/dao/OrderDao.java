package com.luckyGirls.forYourNutrition.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.domain.Order;

public interface OrderDao {
	//주문 조회 방법 -> membrId, orderId 2가지 방법
	List<Order> getOrderByMemberId(int memberId)throws DataAccessException;
	Order getOrder(int orderId) throws DataAccessException;

	//주문 추가
	void insertOrder(Order order) throws DataAccessException;
	
	//주문 취소
	void deleteOrder(int orderId) throws DataAccessException;
}
