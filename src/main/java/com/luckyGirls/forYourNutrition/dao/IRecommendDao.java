package com.luckyGirls.forYourNutrition.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luckyGirls.forYourNutrition.domain.IRecommend;

@Repository
public interface IRecommendDao extends JpaRepository<IRecommend, Long> {
}
