package com.olympic.cis143.m05.student.homework.annotations1;
@FoodItem(type = "taco") 
public class Taco {
	@RawIngredient
	String shell;
	@RawIngredient
	String cheese;
	@RawIngredient
	String tomoato;
	@TopSecret(description = "the scret taco recipe")
	public String getSecretRecipe() {
		String s = "";
		//implemention not shown
		return s;
	}
}
