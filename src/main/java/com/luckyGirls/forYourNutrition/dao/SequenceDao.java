package com.luckyGirls.forYourNutrition.dao;
import org.springframework.dao.DataAccessException;

public interface SequenceDao {
	public int getNextId(String name) throws DataAccessException;
}
