package com.server.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.server.dao.UserDao;
import com.server.model.Result;
import com.server.model.User;

@RestController
public class UsersController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST,produces = "application/json; charset=utf8")
	public Result login(@RequestBody User login){
		return userDao.login(login);
	}
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST, produces = "application/json; charset=utf8")
	public Result idCheck (@RequestBody User user){
		String[] userKey = user.getUserId().split("_");
		String userId = userKey[1];
		if (userId == null && "".equals(userId)) 
			return new Result("fail", 400, "아이디가 입력되지 않았습니다.");

		if (!Pattern.matches("[0-9a-zA-Z]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$", userId))
			return new Result("fail", 400, "e-mail 형식이 아닙니다.");

		if (userDao.getUser(user.getUserId()) == null) 
			return new Result("success", 200, "사용가능합니다.");
		else
			return new Result("fail", 400, "중복된 아이디가 존재합니다.");
	}
	@RequestMapping(value = "/nickNameCheck", method = RequestMethod.POST, produces = "application/json; charset=utf8")
	public Result nickNameCheck (@RequestBody User user){
		String nickName = user.getNickName();
		System.out.println("nickName = " + nickName);
		if (nickName == null && "".equals(nickName)) 
			return new Result("fail", 400, "닉네임이 입력되지 않았습니다.");
		
		if (!Pattern.matches("^[ㄱ-ㅎ가-힣a-zA-Z0-9]*$", nickName)) 
			return new Result("fail", 400, "닉네임은 한글,영문,숫자만 입력 가능합니다.");
		
		byte[] nickNameByte = nickName.getBytes();
		if (nickNameByte.length < 6 || 19 < nickNameByte.length) 
			return new Result("fail", 400, "닉네임은 한글(2~6) 영문,숫자 6~18자 입력 가능합니다.");
	
		if (userDao.getUserNickName(nickName) == null) 
			return new Result("success", 200, "사용가능합니다.");
		else
			return new Result("fail", 400, "중복된 닉네임이 존재합니다.");
		/*Pattern.matches("^[ㄱ-ㅎ가-힣a-zA-Z0-9]*$", userId)*/
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST,produces = "application/json; charset=utf8")
	public Result userAdd(@RequestBody User user){
		System.out.println(user.getUserId());
		System.out.println(user.getNickName());
		System.out.println(user.getPasswd());
		System.out.println(user.getPhone());
		return userDao.userAdd(user);
	}
	@RequestMapping(value = "/users/id", method = RequestMethod.POST,produces = "application/json; charset=utf8")
	public Object getUser(@RequestBody User user){
		user = userDao.getUser(user.getUserId());
		if(user != null){
			user.setPasswd("");
			return user;
		}
		else
			return "{}";
	}
	@RequestMapping(value = "/users/nickName", method = RequestMethod.POST,produces = "application/json; charset=utf8")
	public Object getUserNickName(@RequestBody User user){
		user = userDao.getUserNickName(user.getNickName());
		if(user != null)
			return user;
		else
			return "{}";
	}
}
