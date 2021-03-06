package com.server.model;

/*create table club (	
		id MEDIUMINT AUTO_INCREMENT,
		name varchar(20),
		build_date date,
		member_max_count int(3),
		location varchar(30),
		stadium varchar(30),
		game_time varchar(20),
		days varchar(30),
		age varchar(30),
		uniform_info varchar(100),
		fee varchar(30),
		phone_number varchar(11),
		kakao_talk_id varchar(200),
		profile_image varchar(1000),
		intro_image varchar(100),
		star_total int(4),
		star_count int(4),
		heart_total int(4),
		heart_count int(4),
		admin varchar(30),
		bookmark_count int(5),
		PRIMARY KEY (id)
	);	*/
public class Club {
	private int id;
	private String name;
	private String buildDate;
	private int memberMaxCount;
	private String location;
	private String stadium;
	private String gameTime;
	private String days;
	private String age;
	private String uniformInfo;
	private String fee;
	private String phoneNumber;
	private String kakaoTalkId;
	private String profileImage;
	private String introImage;
	private int starTotal;
	private int starCount;
	private int heartTotal;
	private int heartCount;
	private float starAvg;
	private float heartAvg;
	private float avgSum;
	private String admin;
	private int bookmarkCount;
	private String notice;
	private char state ='y';
	
	public Club() {
		// TODO Auto-generated constructor stub
	}

	public float getStarAvg() {
		return starAvg;
	}

	public void setStarAvg(float starAvg) {
		this.starAvg = starAvg;
	}

	public float getHeartAvg() {
		return heartAvg;
	}

	public void setHeartAvg(float heartAvg) {
		this.heartAvg = heartAvg;
	}

	public float getAvgSum() {
		return avgSum;
	}

	public void setAvgSum(float avgSum) {
		this.avgSum = avgSum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public int getMemberMaxCount() {
		return memberMaxCount;
	}

	public void setMemberMaxCount(int memberMaxCount) {
		this.memberMaxCount = memberMaxCount;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getGameTime() {
		return gameTime;
	}

	public void setGameTime(String gameTime) {
		this.gameTime = gameTime;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUniformInfo() {
		return uniformInfo;
	}

	public void setUniformInfo(String uniformInfo) {
		this.uniformInfo = uniformInfo;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getKakaoTalkId() {
		return kakaoTalkId;
	}

	public void setKakaoTalkId(String kakaoTalkId) {
		this.kakaoTalkId = kakaoTalkId;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getIntroImage() {
		return introImage;
	}

	public void setIntroImage(String introImage) {
		this.introImage = introImage;
	}

	public int getStarTotal() {
		return starTotal;
	}

	public void setStarTotal(int starTotal) {
		this.starTotal = starTotal;
	}

	public int getStarCount() {
		return starCount;
	}

	public void setStarCount(int starCount) {
		this.starCount = starCount;
	}

	public int getHeartTotal() {
		return heartTotal;
	}

	public void setHeartTotal(int heartTotal) {
		this.heartTotal = heartTotal;
	}

	public int getHeartCount() {
		return heartCount;
	}

	public void setHeartCount(int heartCount) {
		this.heartCount = heartCount;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public int getBookmarkCount() {
		return bookmarkCount;
	}

	public void setBookmarkCount(int bookmarkCount) {
		this.bookmarkCount = bookmarkCount;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
	}

	public Club(int id, String name, String buildDate, int memberMaxCount, String location, String stadium,
			String gameTime, String days, String age, String uniformInfo, String fee, String phoneNumber,
			String kakaoTalkId, String profileImage, String introImage, int starTotal, int starCount, int heartTotal,
			int heartCount, String admin, int bookmarkCount, String notice, char state) {
		super();
		this.id = id;
		this.name = name;
		this.buildDate = buildDate;
		this.memberMaxCount = memberMaxCount;
		this.location = location;
		this.stadium = stadium;
		this.gameTime = gameTime;
		this.days = days;
		this.age = age;
		this.uniformInfo = uniformInfo;
		this.fee = fee;
		this.phoneNumber = phoneNumber;
		this.kakaoTalkId = kakaoTalkId;
		this.profileImage = profileImage;
		this.introImage = introImage;
		this.starTotal = starTotal;
		this.starCount = starCount;
		this.heartTotal = heartTotal;
		this.heartCount = heartCount;
		this.admin = admin;
		this.bookmarkCount = bookmarkCount;
		this.notice = notice;
		this.state = state;
	}

}
