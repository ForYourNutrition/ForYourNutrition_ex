package com.luckyGirls.forYourNutrition.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WishItem implements Serializable{
	private int wish_id;
	private Member member;
	private Item item;
}
