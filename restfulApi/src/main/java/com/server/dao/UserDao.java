package com.server.dao;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.server.model.Result;
import com.server.model.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate template;
	public User getUser(String userId){
		try{
			String q = "select * from user where user_id = ?";
			return (User) template.queryForObject(q,  new Object[] { userId }, new BeanPropertyRowMapper(User.class));
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	
	public User getUserNickName(String nickName){
		try{
			String q = "select * from user where nick_name = ?";
			return (User) template.queryForObject(q,  new Object[] { nickName }, new BeanPropertyRowMapper(User.class));
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	public Result userAdd(User user){
		
		String q = "insert into user values(?,?,?,?,?,now(),?,now(),?,?,?,?,?,?,?)";
		Map<String, Integer> resultMap = new HashMap<>();
		int state = template.update(q, 
				user.getName(),
				user.getUserId(),
				user.getNickName(),
				user.getPasswd(),
				user.getPhone(),
				
				user.getSocial(),
				
				user.getUserLevel(),
				user.getSnsAgreement(),
				user.getRecommend(),
				user.getPushState(),
				user.getPushDays(),
				user.getPushLocation(),
				user.getPushTime()
				);
		if ( state > 0)
			return new Result("success", 200, "회원가입 성공");
		else
			return new Result("fail", 400, "회원가입 실패");
		
	}
	public Result login(User login){
		String q = "select user_id from user where user_id = ?";
		try{
			String resultUserId = template.queryForObject(q, new Object[] { login.getUserId() }, String.class);
			if (login.getUserId().equals(resultUserId)){
				String q2 = "select passwd from user where user_id = ? and passwd = ?";
				try{
					String resultUserPasswd = template.queryForObject(q2, new Object[] { login.getUserId(), login.getPasswd() }, String.class);
					if(resultUserPasswd.equals(login.getPasswd())){
						return new Result("success", 200, "로그인 성공하였습니다.");
					}else{
						return new Result("fail", 400, "비밀번호가 일치하지 않습니다.");
					}
				}catch (EmptyResultDataAccessException e) {
					return new Result("fail", 400, "비밀번호가 일치하지 않습니다.");
				}
			}else{
				return new Result("fail", 400, "일치하는 아이디가 없습니다.");
				
			}
		}catch (EmptyResultDataAccessException e) {
			return new Result("fail", 400, "일치하는 아이디가 없습니다.");
		}
	}
}
