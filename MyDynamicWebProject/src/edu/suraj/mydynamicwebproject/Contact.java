package edu.suraj.mydynamicwebproject;

public class Contact {
	private String name = "Suraj";
	private String mobileNum = "917-297-4298";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public int[] getMyArray() {
		return new int[] {75, 34, 56};
	}
}
