/**
 * 
 */
package com.hibernate.stock;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author vpoli
 *
 */
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer categoryId;
	private String name;
	private String desc;
	
	private Set<Stock> stocks = new HashSet<Stock>(0);
	
	public Category(String name, String desc){
		this.name = name;
		this.desc = desc;
	}
	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the stocks
	 */
	public Set<Stock> getStocks() {
		return stocks;
	}
	/**
	 * @param stocks the stocks to set
	 */
	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

}
