package com.server.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.server.model.Attend;
import com.server.model.Club;

@Repository
public class MyPageDao {

	@Autowired
	private JdbcTemplate template;
	
	public List<Club> getClubbookmark(String userId,
			String pageStart,
			String pageNum){
		String q = "select "
				+ "c.* "
				+ "FROM club_bookmark b, club c "
				+ "WHERE b.club_id = c.id "
				+ "AND b.user_id = ? "
				+ "order by c.id desc ";
		if ( pageStart !=null && !"".equals(pageStart) && pageNum !=null && !"".equals(pageNum) )
			q += "LIMIT " + pageStart + ", " + pageNum;
				
		try{
			return template.query(q, new Object[] { userId }, new BeanPropertyRowMapper(Club.class));
		}catch(EmptyResultDataAccessException e){
			return new ArrayList<>();
		}
	}
	
	/*public List<Attend> getPlayGame(String userId,
			String pageStart,
			String pageNum){
		String q = "select "
				+ "c.name 'club_name', a.* "
				+ "FROM play_game p, attend a, club c "
				+ "WHERE a.club_id = c.id "
				+ "AND p.attend_id = a.id "
				+ "AND p.user_id = ? "
				+ "order by a.id desc ";
		if ( pageStart !=null && !"".equals(pageStart) && pageNum !=null && !"".equals(pageNum) )
			q += "LIMIT " + pageStart + ", " + pageNum;
				
		try{
			return template.query(q, new Object[] { userId }, new BeanPropertyRowMapper(Attend.class));
		}catch(EmptyResultDataAccessException e){
			return new ArrayList<>();
		}
	}*/
}
