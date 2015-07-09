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
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		
		for(Employee employee : list){
			System.out.println(employee);
		}
		
		criteria = session.createCriteria(Employee.class);
		Criterion criterion = Restrictions.eq("salary", new Integer(2400));
		criteria.add(criterion);
		list = criteria.list();
		for(Employee employee : list){
			System.out.println(employee);
		}
		
		criteria = session.createCriteria(Employee.class);
		criterion = Restrictions.gt("salary", new Integer(2000));
		criteria.add(criterion);
		list = criteria.list();
		for(Employee employee : list){
			System.out.println(employee);
		}
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
