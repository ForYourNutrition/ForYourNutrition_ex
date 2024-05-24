package com.luckyGirls.forYourNutrition.domain;

import java.util.ArrayList;
import java.util.List;

import com.luckyGirls.forYourNutrition.common.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Item extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_id;

	private String name;

	private int price;

	private String detail;

	private int stock;

	private int category;

	private int target;

	private int effect;

	private int sales;

	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<IRecommend> irecommendList = new ArrayList<>();
}
