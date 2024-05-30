package com.luckyGirls.forYourNutrition.dao.jpa;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.luckyGirls.forYourNutrition.dao.QuestionDao;
import com.luckyGirls.forYourNutrition.domain.Question;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class JpaQuestionDao implements QuestionDao{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public Question getQuestion(int question_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return em.find(Question.class, question_id);
	}
	@Transactional
	@Override
	public void insertQuestion(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		em.persist(question);
	}
	@Transactional
	@Override
	public void updateQuestion(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		em.merge(question);
	}
	@Transactional
	@Override
	public void deleteQuestion(Question question) throws DataAccessException {
		// TODO Auto-generated method stub
		Question managedQuestion = em.merge(question);
		em.remove(managedQuestion);
	}

	/*추후 추가 기능 구현 위해 작성*/
	@Transactional
	@Override
	public List<Question> getQuestionListForItem(int item_id) throws DataAccessException {
		// TODO Auto-generated method stub
		
		TypedQuery<Question> query = em.createQuery(
				"SELECT q FROM Question q JOIN q.item i" + 
				"WHERE i.item_id=?1", Question.class);
		query.setParameter(1, item_id);
		List<Question> questionList = query.getResultList();
		return questionList;	
	}

	@Transactional
	@Override
	public List<Question> getQuestionListForMember(int member_id) throws DataAccessException {
		// TODO Auto-generated method stub
		TypedQuery<Question> query = em.createQuery(
				"select q from Question q JOIN q.member m" + 
				"where m.member_id=?1", Question.class);
		query.setParameter(1, member_id);
		List<Question> questionList = query.getResultList();
		return questionList;
	}

}
