/**
 * 
 */
package com.hibernate.emp;

import java.util.Date;

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
	public static void main( String[] args )
    {
		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
 
		Employee emp = new Employee();
 
		emp.setEmpCode("4715");
		emp.setEmpName("GENM");
		emp.setEmpId(1);
 
		EmpDetail empDetail = new EmpDetail();
		empDetail.setCompName("GENTING Malaysia");
		empDetail.setCompDesc("Best resort in the world");
		empDetail.setRemark("Nothing Special");
		empDetail.setListedDate(new Date());
 
		emp.setEmpDetail(empDetail);
		empDetail.setEmployee(emp);
		try{
		session.save(emp);
		session.getTransaction().commit();
		}catch(Exception exception){
			System.out.println(exception);
			session.load(emp, null);
		}
		System.out.println("Done");

    }


}
