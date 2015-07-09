/**
 * 
 */
package com.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author vpoli
 *
 */
public class StudentDAOImpl implements StudentDAO {

	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	      this.jdbcTemplateObject = jdbcTemplate;
	   }

	   public void create(Integer id, String name, Integer age, String location) {
	      String SQL = "insert into Student (id, name, age, location) values (?, ?, ?, ?)";
	      
	      jdbcTemplateObject.update(SQL, id, name, age, location);
	      System.out.println("Created Record Name = " + name + " Age = " + age);
	      return;
	   }

	   public Student getStudent(Integer id) {
	      String SQL = "select * from Student where id = ?";
	      Student student = jdbcTemplateObject.queryForObject(SQL,new Object[]{id}, new StudentMapper());
	      return student;
	   }

	   public List<Student> listStudents() {
	      String SQL = "select * from Student";
	      List <Student> students = jdbcTemplateObject.query(SQL,new StudentMapper());
	      return students;
	   }

	   public void delete(Integer id){
	      String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }

	   public void update(Integer id, Integer age){
	      String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	   }

	}