package com.luckyGirls.forYourNutrition.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luckyGirls.forYourNutrition.dao.jpa.repository.ItemJpaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {
	private final ItemJpaRepository itemJpaRepository;
}
