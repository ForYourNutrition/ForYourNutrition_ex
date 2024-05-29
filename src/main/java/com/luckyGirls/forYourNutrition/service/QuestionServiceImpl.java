package com.luckyGirls.forYourNutrition.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.luckyGirls.forYourNutrition.dao.QuestionDao;
import com.luckyGirls.forYourNutrition.domain.Question;

@Service("questionServiceImpl")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	@Qualifier("jpaQuestionDao")
	private QuestionDao questionDao;
	
	@Override
	public Question getQuestion(int question_id) {
		// TODO Auto-generated method stub
		return questionDao.getQuestion(question_id);
	}

	@Override
	public void insertQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.insertQuestion(question);
	}

	@Override
	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.updateQuestion(question);
	}

	@Override
	public void deleteQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.deleteQuestion(question);
	}

	@Override
	public List<Question> getQuestionListForItem(int item_id) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionListForItem(item_id);
	}

	@Override
	public List<Question> getQuestionListForMember(int member_id) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionListForMember(member_id);
	}
	
}
