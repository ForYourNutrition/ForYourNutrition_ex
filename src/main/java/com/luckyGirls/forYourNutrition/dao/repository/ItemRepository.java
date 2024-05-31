package com.luckyGirls.forYourNutrition.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luckyGirls.forYourNutrition.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
