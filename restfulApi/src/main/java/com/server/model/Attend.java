package com.server.model;
/*create table attend (   
		   id MEDIUMINT AUTO_INCREMENT,
		   club_id int(10),
		   location varchar(30),
		   member_count int(3),
		   stadium varchar(30),
		   game_time varchar(20),
		   days varchar(30),
		   fee varchar(30),
		   recruit int(3),
		   notice varchar(1000),
		   PRIMARY KEY (id)
		);
*/
public class Attend {
	private int id;
	private String location;
	private int memberCount;
	private int maxMember;
	private String stadium;
	private String gameStartTime;
	private String gameEndTime;
	private String gameDate;
	private int fee;
	private String notice;
	private int clubId;
	private String clubName;
	private String clubProfileImage;
	private int clubStarTotal;
	private int clubStarCount;
	private int clubHeartTotal;
	private int clubHeartCount;
	private float starAvg;
	private float heartAvg;
	private float avgSum;
	private int clubBookmarkCount;
	private String vs;
	public Attend() {
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}
	public int getMaxMember() {
		return maxMember;
	}
	public void setMaxMember(int maxMember) {
		this.maxMember = maxMember;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getGameStartTime() {
		return gameStartTime;
	}
	public void setGameStartTime(String gameStartTime) {
		this.gameStartTime = gameStartTime;
	}
	public String getGameEndTime() {
		return gameEndTime;
	}
	public void setGameEndTime(String gameEndTime) {
		this.gameEndTime = gameEndTime;
	}
	public String getGameDate() {
		return gameDate;
	}
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubProfileImage() {
		return clubProfileImage;
	}
	public void setClubProfileImage(String clubProfileImage) {
		this.clubProfileImage = clubProfileImage;
	}
	public int getClubStarTotal() {
		return clubStarTotal;
	}
	public void setClubStarTotal(int clubStarTotal) {
		this.clubStarTotal = clubStarTotal;
	}
	public int getClubStarCount() {
		return clubStarCount;
	}
	public void setClubStarCount(int clubStarCount) {
		this.clubStarCount = clubStarCount;
	}
	public int getClubHeartTotal() {
		return clubHeartTotal;
	}
	public void setClubHeartTotal(int clubHeartTotal) {
		this.clubHeartTotal = clubHeartTotal;
	}
	public int getClubHeartCount() {
		return clubHeartCount;
	}
	public void setClubHeartCount(int clubHeartCount) {
		this.clubHeartCount = clubHeartCount;
	}
	public int getClubBookmarkCount() {
		return clubBookmarkCount;
	}
	public void setClubBookmarkCount(int clubBookmarkCount) {
		this.clubBookmarkCount = clubBookmarkCount;
	}
	public String getVs() {
		return vs;
	}
	public void setVs(String vs) {
		this.vs = vs;
	}
	public Attend(int id, String location, int memberCount, int maxMember, String stadium, String gameStartTime,
			String gameEndTime, String gameDate, int fee, String notice, int clubId, String clubName,
			String clubProfileImage, int clubStarTotal, int clubStarCount, int clubHeartTotal, int clubHeartCount,
			float starAvg, float heartAvg, float avgSum, int clubBookmarkCount, String vs) {
		super();
		this.id = id;
		this.location = location;
		this.memberCount = memberCount;
		this.maxMember = maxMember;
		this.stadium = stadium;
		this.gameStartTime = gameStartTime;
		this.gameEndTime = gameEndTime;
		this.gameDate = gameDate;
		this.fee = fee;
		this.notice = notice;
		this.clubId = clubId;
		this.clubName = clubName;
		this.clubProfileImage = clubProfileImage;
		this.clubStarTotal = clubStarTotal;
		this.clubStarCount = clubStarCount;
		this.clubHeartTotal = clubHeartTotal;
		this.clubHeartCount = clubHeartCount;
		this.starAvg = starAvg;
		this.heartAvg = heartAvg;
		this.avgSum = avgSum;
		this.clubBookmarkCount = clubBookmarkCount;
		this.vs = vs;
	}
		
}
