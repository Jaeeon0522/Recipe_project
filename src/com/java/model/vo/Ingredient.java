package com.java.model.vo;

//////// 재료(Ingredient)
public class Ingredient {

		private int indnum;  //재료번호
		private String ind_name;	//재료이름
		private String amount;	//수량
		private int recipe_num;	//레시피번호
		
		public Ingredient() {
			super();
		}
		
		public Ingredient(int indnum, String ind_name, String amount, int recipe_num) {
			super();
			this.indnum = indnum;
			this.ind_name = ind_name;
			this.amount = amount;
			this.recipe_num = recipe_num;
		}
		
		public int getIndnum() {
			return indnum;
		}
		public void setIndnum(int indnum) {
			this.indnum = indnum;
		}
		public String getInd_name() {
			return ind_name;
		}
		public void setInd_name(String ind_name) {
			this.ind_name = ind_name;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public int getRecipe_num() {
			return recipe_num;
		}
		public void setRecipe_num(int recipe_num) {
			this.recipe_num = recipe_num;
		}
		@Override
		public String toString() {
			return "Ingredient [indnum=" + indnum + ", ind_name=" + ind_name + ", amount=" + amount + ", recipe_num="
					+ recipe_num + "]";
		}
		
		
		
}
