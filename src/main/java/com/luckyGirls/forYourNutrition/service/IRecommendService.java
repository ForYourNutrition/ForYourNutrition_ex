package com.luckyGirls.forYourNutrition.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckyGirls.forYourNutrition.dao.IRecommendDao;
import com.luckyGirls.forYourNutrition.dao.ItemDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class IRecommendService {
	private static ItemDao itemDao;
	private static IRecommendDao iRecommendDao;
}
