package in.careerit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.careerit.beans.Dept;


public class DeptRowMapper implements RowMapper<Dept>{
	
	@Override
	public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dept dept = new Dept();
		dept.setDeptNo(rs.getInt(1));
		dept.setDName(rs.getString(2));
		dept.setLoc(rs.getString(3));
		return dept;
	}
	}
