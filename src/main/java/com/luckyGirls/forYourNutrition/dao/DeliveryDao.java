package com.luckyGirls.forYourNutrition.dao;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.domain.Delivery;
public interface DeliveryDao {
	//배송 객체 가져오기
	Delivery getDelivery(int deliveryId)throws DataAccessException;
	Delivery getDeliveryByOrderId(int oderId)throws DataAccessException;
	//배송 조회
	int viewDeliveryStatus(int orderId)throws DataAccessException;
	//배송 상태 변경
	void changeDeliveryStatus(int deliveryId, int status)throws DataAccessException;
	void changeDeliveryStatusByOrderId(int orderId, int status)throws DataAccessException;
}
