/**
 * 
 */
package com.spring.jdbc;

/**
 * @author vpoli
 *
 */
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public interface StudentDAO {
   /** 
    * This is the method to be used to initialize
    * database resources ie. connection.
    */
   public void setJdbcTemplate(JdbcTemplate   jdbcTemplate);
   /**    * This is the method to be used to create
    * a record in the Student table.
    */
   public void create(Integer id, String name, Integer age, String location);
   /** 
    * This is the method to be used to list down
    * a record from the Student table corresponding
    * to a passed student id.
    */
   public Student getStudent(Integer id);
   /** 
    * This is the method to be used to list down
    * all the records from the Student table.
    */
   public List<Student> listStudents();
   /** 
    * This is the method to be used to delete
    * a record from the Student table corresponding
    * to a passed student id.
    */
   public void delete(Integer id);
   /** 
    * This is the method to be used to update
    * a record into the Student table.
    */
   public void update(Integer id, Integer age);
}