package com.luckyGirls.forYourNutrition.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luckyGirls.forYourNutrition.domain.IRecommend;

@Repository
public interface IRecommendRepository extends JpaRepository<IRecommend, Long> {
}
