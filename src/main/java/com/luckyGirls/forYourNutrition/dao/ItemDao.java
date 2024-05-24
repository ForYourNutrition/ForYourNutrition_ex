package com.luckyGirls.forYourNutrition.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luckyGirls.forYourNutrition.domain.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Long> {

}
