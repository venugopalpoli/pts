/**
 * 
 */
package com.hibernate.emp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.hibernate.persistence.HibernateUtil;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

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
		
		Employee employee = (Employee) session.load(Employee.class, new Integer(34));
		
		System.out.println(employee.getId());
		
		System.out.println(employee.getFirstName());
		//employee.setSalary(5000);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
