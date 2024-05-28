package com.luckyGirls.forYourNutrition.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckyGirls.forYourNutrition.dao.jpa.repository.IRecommendJpaRepository;
import com.luckyGirls.forYourNutrition.dao.jpa.repository.ItemJpaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class IRecommendService {
	private static ItemJpaRepository itemRepository;
	private static IRecommendJpaRepository iRecommendRepository;
}
