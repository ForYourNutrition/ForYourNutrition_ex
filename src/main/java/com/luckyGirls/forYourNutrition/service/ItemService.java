package com.luckyGirls.forYourNutrition.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckyGirls.forYourNutrition.dao.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ItemService {
	private final ItemRepository itemRepository;
}
