package com.luckyGirls.forYourNutrition.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ItemGetResponse {
	private String name;

	private int price;

	private String detail;

	private int stock;

	private int category;

	private int target;

	private int effect;

	private int sales;
}
