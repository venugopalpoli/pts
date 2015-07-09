/**
 * 
 */
package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author vpoli
 *
 */
public class StudentMapper implements RowMapper<Student> {
	   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Student student = new Student();
	      student.setId(rs.getInt("id"));
	      student.setName(rs.getString("name"));
	      student.setAge(rs.getInt("age"));
	      student.setLocation(rs.getString("location"));
	      return student;
	   }
}
