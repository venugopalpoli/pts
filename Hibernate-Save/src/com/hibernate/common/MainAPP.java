/**
 * 
 */
package com.hibernate.common;

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
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Stock stock = new Stock();
 
        stock.setStockCode("4715");
        stock.setStockName("GENM");
 
        session.save(stock);
        session.getTransaction().commit();
    }


}
