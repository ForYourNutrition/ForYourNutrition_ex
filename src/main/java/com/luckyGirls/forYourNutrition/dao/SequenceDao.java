package com.luckyGirls.forYourNutrition.dao;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;


public interface SequenceDao {
	public int getNextId(String name) throws DataAccessException;
}
