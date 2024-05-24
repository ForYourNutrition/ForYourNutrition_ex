package com.luckyGirls.forYourNutrition.dao.jpa;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.dao.QuestionDao;
import com.luckyGirls.forYourNutrition.domain.Question;

public class JpaQuestionDao implements QuestionDao{

	@Override
	public Question getQuestion(int question_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addQuestion(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQuestion(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQuestion(int question_id) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> getQuestionListForItem(int item_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getQuestionListForMember(int member_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
