package com.luckyGirls.forYourNutrition.dao.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.dao.DeliveryDao;
import com.luckyGirls.forYourNutrition.dao.SequenceDao;
import com.luckyGirls.forYourNutrition.domain.Delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
@Repository
public class JpaDeliveryDao implements DeliveryDao{
	@PersistenceContext
    private EntityManager em;

	@Autowired
	private SequenceDao sequenceDao;
		
	@Override
	public int viewDeliveryStatus(int orderId) throws DataAccessException {
		// TODO Auto-generated method stub
		Delivery delivery = em.find(Delivery.class, orderId);
		return delivery.getStatus();
	}

	@Override
	public void changeDeliveryStatus(int deliveryId, int status) throws DataAccessException {
		// TODO Auto-generated method stub
		Delivery delivery = em.find(Delivery.class, deliveryId);
		delivery.setStatus(status);
		em.merge(delivery);	
	}

	@Override
	public Delivery getDelivery(int deliveryId) throws DataAccessException {
		// TODO Auto-generated method stub
		return em.find(Delivery.class, deliveryId);
	}

	@Override
	public Delivery getDeliveryByOrderId(int orderId) throws DataAccessException {
		// TODO Auto-generated method stub
		TypedQuery<Delivery> query = em.createQuery(
                "select delivery from Delivery delivery " +
                "where delivery.orderid=?1",
                Delivery.class);
		query.setParameter(1, orderId);	
        return query.getSingleResult();
	}

	@Override
	public void changeDeliveryStatusByOrderId(int orderId, int status) throws DataAccessException {
		// TODO Auto-generated method stub
		Delivery delivery = getDeliveryByOrderId(orderId);
		delivery.setStatus(status);
		em.merge(delivery);
	}

}
