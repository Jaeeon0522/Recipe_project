package com.java.model.vo;

/////���ã�� ������
public class Myrecipe {
	
	private int recipe_num;	//������ ��ȣ
	private int usernum;	//����ȣ
	
	public Myrecipe() {
		super();
	}

	public Myrecipe(int recipe_num, int usernum) {
		super();
		this.recipe_num = recipe_num;
		this.usernum = usernum;
	}

	public int getRecipe_num() {
		return recipe_num;
	}

	public void setRecipe_num(int recipe_num) {
		this.recipe_num = recipe_num;
	}

	public int getUsernum() {
		return usernum;
	}

	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}

	@Override
	public String toString() {
		return "Myrecipe [recipe_num=" + recipe_num + ", usernum=" + usernum + "]";
	}
	
}
