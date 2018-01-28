package com.java.model.vo;

public class RecipeRecipeWay {
	
	private int recipenum;  //레시피 고유번호(PK)
	private String recipename; // 레시피 이름
	private String rtype; // 종류
	private String rlevel;// 난이도
	private int rlike;// 좋아요
	private String rtime;// 조리시간
	private int rclick;// 조회수
	private int rcrap;// 스크랩
	private int recipe_num;  //레시피 번호
	private int sequence;	//조리번호
	private String stroy;	//조리내용
	private String picture;	//사진
	
	public RecipeRecipeWay(int recipenum, String recipename, String rtype, String rlevel, int rlike, String rtime,
			int rclick, int rcrap, int recipe_num, int sequence, String stroy, String picture) {
		super();
		this.recipenum = recipenum;
		this.recipename = recipename;
		this.rtype = rtype;
		this.rlevel = rlevel;
		this.rlike = rlike;
		this.rtime = rtime;
		this.rclick = rclick;
		this.rcrap = rcrap;
		this.recipe_num = recipe_num;
		this.sequence = sequence;
		this.stroy = stroy;
		this.picture = picture;
	}
	
	public RecipeRecipeWay(int recipenum, String recipename, String rtype, String rlevel, int rlike, String rtime,
			int rclick, int rcrap, int recipe_num, int sequence, String stroy) {
		super();
		this.recipenum = recipenum;
		this.recipename = recipename;
		this.rtype = rtype;
		this.rlevel = rlevel;
		this.rlike = rlike;
		this.rtime = rtime;
		this.rclick = rclick;
		this.rcrap = rcrap;
		this.recipe_num = recipe_num;
		this.sequence = sequence;
		this.stroy = stroy;
	}

	public int getRecipenum() {
		return recipe_num;
	}
	public void setRecipenum(int recipe_num) {
		this.recipe_num = recipe_num;
	}
	public String getRecipename() {
		return recipename;
	}
	public void setRecipename(String recipename) {
		this.recipename = recipename;
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public String getRlevel() {
		return rlevel;
	}
	public void setRlevel(String rlevel) {
		this.rlevel = rlevel;
	}
	public int getRlike() {
		return rlike;
	}
	public void setRlike(int rlike) {
		this.rlike = rlike;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public int getRclick() {
		return rclick;
	}
	public void setRclick(int rclick) {
		this.rclick = rclick;
	}
	public int getRcrap() {
		return rcrap;
	}
	public void setRcrap(int rcrap) {
		this.rcrap = rcrap;
	}
	public int getRecipe_num() {
		return recipe_num;
	}
	public void setRecipe_num(int recipe_num) {
		this.recipe_num = recipe_num;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getStroy() {
		return stroy;
	}
	public void setStroy(String stroy) {
		this.stroy = stroy;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "RecipeRecipeWay [recipenum=" + recipe_num + ", recipename=" + recipename + ", rtype=" + rtype
				+ ", rlevel=" + rlevel + ", rlike=" + rlike + ", rtime=" + rtime + ", rclick=" + rclick + ", rcrap="
				+ rcrap + ", recipe_num=" + recipe_num + ", sequence=" + sequence + ", stroy=" + stroy + ", picture="
				+ picture + "]";
	}
	
}
