package com.luckyGirls.forYourNutrition.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.domain.Question;

public interface QuestionDao {
	Question getQuestion(int question_id) throws DataAccessException; //문의 정보 조회
	
	void addQuestion(Question question) throws DataAccessException; //문의 추가
	
	void updateQuestion(Question question) throws DataAccessException; //문의 수정
	
	void deleteQuestion(int question_id) throws DataAccessException; //문의 삭제
	
	List<Question> getQuestionListForItem(int item_id) throws DataAccessException; //상품에 대한 모든 문의 조회
	
	List<Question> getQuestionListForMember(int member_id) throws DataAccessException; //해당 멤버가 작성한 모든 문의 내역을 조회
}
