/**
 * 
 */
package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vpoli
 *
 */
public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

	      StudentDAOImpl studentJDBCTemplate = 
	      (StudentDAOImpl)context.getBean("studentDAO");
	      
	      System.out.println("------Records Creation--------" );
	     // studentJDBCTemplate.create(new Integer(8),"Venu",35,"UK");
	     // studentJDBCTemplate.create(new Integer(9),"Malli",30,"Qatar");
	      studentJDBCTemplate.create(new Integer(11),"Hari",33,"US");

	      System.out.println("------Listing Multiple Records--------" );
	      List<Student> students = studentJDBCTemplate.listStudents();
	      for (Student record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("----Updating Record with ID = 2 -----" );
	      studentJDBCTemplate.update(2, 20);

	      System.out.println("----Listing Record with ID = 2 -----" );
	      Student student = studentJDBCTemplate.getStudent(2);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
	      
	      studentJDBCTemplate.delete(17);
	}
}
