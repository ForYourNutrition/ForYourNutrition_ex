package com.luckyGirls.forYourNutrition.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luckyGirls.forYourNutrition.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
	private final ItemService itemService;
}
