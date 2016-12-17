package com.server.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.dao.ClubDao;
import com.server.model.Club;
import com.server.model.Result;

@RestController
public class ClubController {
	@Autowired
	private ClubDao clubDao;
	
	@RequestMapping(value="/clubs", method = RequestMethod.GET, produces = "application/json; charset=utf8")
	public List<Club> clubs(
			@RequestParam(required=false) String whenDay, 
			@RequestParam(required=false) String whenDayOfTheWeek,
			@RequestParam(required=false) String whenTime,
			@RequestParam(required=false) String whereLocation,
			@RequestParam(required=false) String pageStart,
			@RequestParam(required=false) String pageNum,
			@RequestParam(required=false) String sortType,
			@RequestParam(required=false) String searchKeyword 
			){
		List<Club> clubList = clubDao.clubs(whenDay, whenDayOfTheWeek, whenTime, whereLocation, pageStart, pageNum, sortType, searchKeyword);
		List<Club> clubListAvg = new ArrayList<Club>();
		for (Club club : clubList)
			clubListAvg.add(pointReckoning(club));
		
		return clubListAvg;
	}	
	@RequestMapping(value="/clubs/getId/{id}", method = RequestMethod.GET,produces = "application/json; charset=utf8")
	public Object clubsGetId(@PathVariable Integer id){
		Club club = clubDao.clubGet(id);		
		if(club != null)
			return pointReckoning(club);
		else 
			return "{}";
	}
	@RequestMapping(value="/clubs/getName/{name}", method = RequestMethod.GET,produces = "application/json; charset=utf8")
	public Object clubsGetName( @PathVariable String name){
		Club club = clubDao.clubGetName(name);
		if(club != null)
			return pointReckoning(club);
		else 
			return "{}";
	}
	@RequestMapping(value="/clubs/getAdmin/{admin}", method = RequestMethod.GET,produces = "application/json; charset=utf8")
	public Object clubsGetAdmin( @PathVariable String admin){
		Club club = clubDao.clubGetAdmin(admin);
		if(club != null)
			return pointReckoning(club);
		else 
			return "{}";
	}
	
	private Club pointReckoning(Club club){
    	float heartAvg = (float) 0.0;
	    if (club.getHeartTotal() != 0 && club.getHeartCount() != 0)
	    	heartAvg = Float.parseFloat(String.format("%.1f",(float)club.getHeartTotal()/(float)club.getHeartCount()));
		club.setHeartAvg(heartAvg);
		
		float starAvg = (float) 0.0;
	    if (club.getStarTotal() != 0 && club.getStarCount() != 0)
	    	starAvg = Float.parseFloat(String.format("%.1f",(float)club.getStarTotal()/(float)club.getStarCount()));

	    club.setStarAvg(starAvg);
	    club.setAvgSum(Float.parseFloat(String.format("%.1f",heartAvg + starAvg)));
		return club;
	}

	@RequestMapping(value="/clubs", method = RequestMethod.POST,produces = "application/json; charset=utf8")
	public Result clubAdd(@RequestBody Club club ){
		System.out.println("club.getProfileImage() = " + club.getProfileImage());
		int cnt = clubDao.clubAdd(club);
		if(cnt>0){
			int managerCnt = clubDao.addClubManager(clubDao.clubGetName(club.getName()).getId(), clubDao.clubGetName(club.getName()).getAdmin());
			if(managerCnt>0)
				return new Result("success", 200, "클럽이 만들어졌습니다.");
			else
				return new Result("fail", 400, "클럽이 만들어졌으나, 클럽 메니저가 만들어지지 않았습니다.");
		}else
			return new Result("fail", 400, "클럽생성 실패, 관리자에게 문의 바랍니다.");
			
	}	
}
