package com.luckyGirls.forYourNutrition.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.domain.Review;

public interface ReviewDao {
	Review getReview(int review_id) throws DataAccessException; //후기 정보 조회
	
	void addReview(Review review) throws DataAccessException; //후기 추가
	
	void updateReview(Review review) throws DataAccessException; //후기 수정
	
	void deleteReview(int review_id) throws DataAccessException; //후기 삭제
	
	List<Review> getReviewListForItem(int item_id) throws DataAccessException; //상품에 대한 모든 후기 조회
	
	List<Review> getReviewListForMember(int member_id) throws DataAccessException; //해당 멤버가 작성한 모든 후기 내역을 조회
}
