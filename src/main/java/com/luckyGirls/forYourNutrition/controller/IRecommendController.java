package com.luckyGirls.forYourNutrition.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luckyGirls.forYourNutrition.service.IRecommendService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recommend")
public class IRecommendController {
	private static IRecommendService iRecommendService;
}
