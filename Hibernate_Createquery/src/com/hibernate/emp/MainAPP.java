/**
 * 
 */
package com.hibernate.emp;

import org.hibernate.Session;

import com.hibernate.persistence.HibernateUtil;

/**
 * @author vpoli
 *
 */
public class MainAPP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		/*
		 * Employee employee = new Employee(); employee.setFirstName("Neelesh");
		 * employee.setLastName("Reddy"); employee.setSalary(2100);
		 * 
		 * session.save(employee);
		 */

		/*Employee employee = (Employee) session.load(Employee.class,
				new Integer(3));
		System.out.println(employee);

		employee = (Employee) session.load(Employee.class, new Integer(5));
		System.out.println(employee);

		employee = (Employee) session.load(Employee.class, new Integer(3));
		System.out.println(employee);

		employee = (Employee) session.load(Employee.class, new Integer(5));
		System.out.println(employee);

		session.evict(employee);
		System.out.println("ID " + employee.getId() + " removed from Cache");

		employee = (Employee) session.load(Employee.class, new Integer(3));
		System.out.println(employee);

		employee = (Employee) session.load(Employee.class, new Integer(5));
		System.out.println(employee);

		employee = (Employee) session.load(Employee.class, new Integer(3));
		System.out.println(employee);

		employee = (Employee) session.load(Employee.class, new Integer(5));
		System.out.println(employee);

		
		  List<Employee> employees =
		  session.createQuery("from Employee").list(); for(Employee employee :
		  employees){ System.out.println(employee); }
		 */

		Employee employee = (Employee) session.load(Employee.class, new Integer(3));
		System.out.println(employee);
		employee = (Employee) session.load(Employee.class, new Integer(3));
		System.out.println(employee);
		
		/*session.getTransaction().commit();
		session.close();
		
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();*/
		
		session.evict(employee);
		
		employee = (Employee) session.load(Employee.class, new Integer(3));
		System.out.println(employee);
		employee = (Employee) session.load(Employee.class, new Integer(5));
		System.out.println(employee);
		
		System.out.println("Done");

		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
