package com.java.model.vo;

///////////////레시피
public class Recipe {

	private int recipe_num;  //레시피 고유번호(PK)
	private String recipename; // 레시피 이름
	private String rtype; // 종류
	private String rlevel;// 난이도
	private int rlike;// 좋아요
	private String rtime;// 조리시간
	private int rclick;// 조회수
	private int rcrap;// 스크랩
	
	public Recipe(int recipe_num, String recipename, String rtype, String rlevel, int rlike, String rtime, int rclick,
			int rcrap) {
		super();
		this.recipe_num = recipe_num;
		this.recipename = recipename;
		this.rtype = rtype;
		this.rlevel = rlevel;
		this.rlike = rlike;
		this.rtime = rtime;
		this.rclick = rclick;
		this.rcrap = rcrap;
	}

	public Recipe(String recipename, String rtype, String rlevel, int rlike, String rtime) {
		super();
		this.recipename = recipename;
		this.rtype = rtype;
		this.rlevel = rlevel;
		this.rlike = rlike;
		this.rtime = rtime;
	}
	
	public int getRecipe_num() {
		return recipe_num;
	}

	public void setRecipe_num(int recipe_num) {
		this.recipe_num = recipe_num;
	}

	public Recipe(String recipename, String rtype, String rlevel, int rlike, String rtime, int rclick, int rcrap) {
		super();
		this.recipename = recipename;
		this.rtype = rtype;
		this.rlevel = rlevel;
		this.rlike = rlike;
		this.rtime = rtime;
		this.rclick = rclick;
		this.rcrap = rcrap;
	}
	
	public Recipe() {
		super();
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

	@Override
	public String toString() {
		return "Recipe [recipename=" + recipename + ", rtype=" + rtype + ", rlevel=" + rlevel + ", rlike=" + rlike
				+ ", rtime=" + rtime + ", rclick=" + rclick + ", rcrap=" + rcrap + "]";
	}

}
