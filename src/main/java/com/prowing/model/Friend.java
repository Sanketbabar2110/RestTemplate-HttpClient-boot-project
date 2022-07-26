package com.prowing.model;

public class Friend {

	private String Id;
	private String name;
	private long mobileNum;
	private String college;

	public Friend() {
		super();
	}

	public Friend(String id, String name, long mobileNum, String college) {
		super();
		Id = id;
		this.name = name;
		this.mobileNum = mobileNum;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Friend [Id=" + Id + ", name=" + name + ", mobileNum=" + mobileNum + ", college=" + college + "]";
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
