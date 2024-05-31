package com.luckyGirls.forYourNutrition.service;

import java.util.List;

import com.luckyGirls.forYourNutrition.domain.Question;

public interface QuestionService {
	Question getQuestion(int question_id); //문의 정보 조회
	
	void insertQuestion(Question question); //문의 추가
	
	void updateQuestion(Question question); //문의 수정
	
	void deleteQuestion(Question question); //문의 삭제
	
	List<Question> getQuestionListForItem(int item_id); //상품에 대한 모든 문의 조회
	
	List<Question> getQuestionListForMember(int member_id); //해당 멤버가 작성한 모든 문의 내역을 조회

}
