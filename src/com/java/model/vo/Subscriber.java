package com.java.model.vo;

///������
public class Subscriber {
	
	private int usernum; //����ȣ
	private int mynum;	//�Ǳ�����
	
	public Subscriber() {
		super();
	}

	public Subscriber(int usernum, int mynum) {
		super();
		this.usernum = usernum;
		this.mynum = mynum;
	}

	public int getUsernum() {
		return usernum;
	}

	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}

	public int getMynum() {
		return mynum;
	}

	public void setMynum(int mynum) {
		this.mynum = mynum;
	}

	@Override
	public String toString() {
		return "Subscriber [usernum=" + usernum + ", mynum=" + mynum + "]";
	}
	
	
	
}
