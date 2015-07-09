/**
 * 
 */
package com.hibernate.stock;

import java.util.HashSet;
import java.util.Set;

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
		System.out.println("Hibernate many to many (XML Mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();
	 
		session.beginTransaction();
	 
		Stock stock = new Stock();
	        stock.setStockCode("7053");
	        stock.setStockName("RAGINI");
	 
	        Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
	        Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");
	 
	        Set<Category> categories = new HashSet<Category>();
	        categories.add(category1);
	        categories.add(category2);
	 
	        stock.setCategories(categories);
	 
	        session.save(stock);
	 
		session.getTransaction().commit();
		System.out.println("Done");

    }


}
