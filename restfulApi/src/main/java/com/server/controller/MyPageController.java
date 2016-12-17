package com.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.dao.MyPageDao;
import com.server.model.Attend;
import com.server.model.Club;

@RestController
public class MyPageController {

	@Autowired
	private MyPageDao myPageDao;
	@RequestMapping(value="/myPage/clubbookmark", method = RequestMethod.GET, produces = "application/json; charset=utf8")
	public List<Club> getClubbookmark(
			@RequestParam(required=false) String userId, 
			@RequestParam(required=false) String pageStart,
			@RequestParam(required=false) String pageNum){
		return myPageDao.getClubbookmark(userId, pageStart, pageNum);
	}
	/*@RequestMapping(value="/myPage/playGame", method = RequestMethod.GET, produces = "application/json; charset=utf8")
	public List<Attend> getPlayGame(
			@RequestParam(required=false) String userId, 
			@RequestParam(required=false) String pageStart,
			@RequestParam(required=false) String pageNum){
		return myPageDao.getPlayGame(userId, pageStart, pageNum);
	}*/
}
