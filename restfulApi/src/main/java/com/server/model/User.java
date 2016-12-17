package com.server.model;

public class User {
	private String name = "";
	private String userId = "";
	private String nickName = "";
	private String passwd = "";
	private String phone = "";
	private String signupDate = "";
	private String social = "";
	private String lastLoginDate = "";
	private String userLevel = "";
	private int snsAgreement = 0;
	private String recommend = "";
	private String pushState = "off";
	private String pushDays = "";
	private String pushLocation = "";
	private String pushTime = "";
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(String signupDate) {
		this.signupDate = signupDate;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public int getSnsAgreement() {
		return snsAgreement;
	}

	public void setSnsAgreement(int snsAgreement) {
		this.snsAgreement = snsAgreement;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getPushState() {
		return pushState;
	}

	public void setPushState(String pushState) {
		this.pushState = pushState;
	}

	public String getPushDays() {
		return pushDays;
	}

	public void setPushDays(String pushDays) {
		this.pushDays = pushDays;
	}

	public String getPushLocation() {
		return pushLocation;
	}

	public void setPushLocation(String pushLocation) {
		this.pushLocation = pushLocation;
	}

	public String getPushTime() {
		return pushTime;
	}

	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}

	public User(String name, String userId, String nickName, String passwd, String phone, String signupDate,
			String social, String lastLoginDate, String userLevel, int snsAgreement, String recommend, String pushState,
			String pushDays, String pushLocation, String pushTime) {
		super();
		this.name = name;
		this.userId = userId;
		this.nickName = nickName;
		this.passwd = passwd;
		this.phone = phone;
		this.signupDate = signupDate;
		this.social = social;
		this.lastLoginDate = lastLoginDate;
		this.userLevel = userLevel;
		this.snsAgreement = snsAgreement;
		this.recommend = recommend;
		this.pushState = pushState;
		this.pushDays = pushDays;
		this.pushLocation = pushLocation;
		this.pushTime = pushTime;
	}
}
