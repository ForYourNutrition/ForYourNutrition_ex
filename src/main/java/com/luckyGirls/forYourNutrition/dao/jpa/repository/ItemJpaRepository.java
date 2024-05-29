package com.luckyGirls.forYourNutrition.dao.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luckyGirls.forYourNutrition.domain.Item;

@Repository
public interface ItemJpaRepository extends JpaRepository<Item, Integer> {
	Optional<Item> findByItem_id(int item_id);

	List<Item> findAllByCategory(int category);
}
