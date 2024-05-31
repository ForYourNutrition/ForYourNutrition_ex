package com.luckyGirls.forYourNutrition.dao.jpa;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.dao.DataAccessException;
// import org.springframework.stereotype.Repository;
//
// import com.luckyGirls.forYourNutrition.dao.OrderDao;
// import com.luckyGirls.forYourNutrition.dao.SequenceDao;
// import com.luckyGirls.forYourNutrition.domain.Order;
// import com.luckyGirls.forYourNutrition.domain.OrderItem;
//
// @Repository
// public class JpaOrderDao implements OrderDao{
// 	@PersistenceContext
//     private EntityManager em;
//
// 	@Autowired
// 	private SequenceDao sequenceDao;
//
// 	public List<Order> getOrderByMemberId(int memberId) throws DataAccessException {
// 		TypedQuery<Order> query = em.createQuery(
//                 "select order from Order order " +
//                 "where order.memberid=?1",
//                 Order.class);
// 		query.setParameter(1, memberId);
//         return query.getResultList();
// 	}
//
// 	public Order getOrder(int orderId) throws DataAccessException {
// 	/*
// 		Order order = orderMapper.getOrder(orderId);
// 		if (order != null) {
// 			order.setLineItems(lineItemMapper.getLineItemsByOrderId(orderId));
// 		}
// 	    return order;
// 	*/
//         return em.find(Order.class, orderId);
// 	}
//
// 	public void insertOrder(Order order) throws DataAccessException {
// 	/*
//     	orderMapper.insertOrder(order);
//     	orderMapper.insertOrderStatus(order);
//     	for (int i = 0; i < order.getLineItems().size(); i++) {
//     		LineItem lineItem = (LineItem) order.getLineItems().get(i);
//     		lineItem.setOrderId(order.getOrderId());
//     	}
//     */
// 		int newOrderId = sequenceDao.getNextId("ordernum");
//     	order.setOrderId(newOrderId);
//     	for (int i = 0; i < order.getLineItems().size(); i++) {
//     		OrderItem orderItem = (OrderItem) order.getLineItems().get(i);
//     		orderItem.setOrderId(newOrderId);
//     	}
//         em.persist(order);
// 	}
//
// 	public void deleteOrder(int orderId) throws DataAccessException{
// 		em.remove(getOrder(orderId));
// 	}
//
// }
