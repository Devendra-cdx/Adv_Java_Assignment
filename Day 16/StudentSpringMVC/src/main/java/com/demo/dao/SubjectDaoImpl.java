package com.demo.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Subject> displaySubject() {
		List<Subject> slist = jdbcTemplate.query("select * from Module",
				BeanPropertyRowMapper.newInstance(Subject.class));
		return slist;
	}

	public boolean insertNewSub(Subject s) {
		System.out.println(s);
		int n = jdbcTemplate.update("insert into Module values(?,?,?,?)",
				new Object[] { s.getSid(), s.getsName(), s.getDuration(), s.getStdt() });
		return n > 0;
	}

	public boolean deletbyId(int sid) {

		int n = jdbcTemplate.update("delete from Module where sid = ?", new Object[] { sid });

		return n > 0;
	}

	public Subject findById(int sid) {
		try {
			Subject s = jdbcTemplate.queryForObject("select * from Module where sid = ?", new Object[] { sid },
					BeanPropertyRowMapper.newInstance(Subject.class));
			return s;
		} catch (EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public boolean modifySub(Subject s) {
		int n = jdbcTemplate.update("update Module set sname = ?, duration = ?, stdt = ? where sid = ?",
				new Object[] { s.getsName(), s.getDuration(), s.getStdt(), s.getSid() });
		return n > 0;
	}

}
