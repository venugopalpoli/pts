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
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;
	 
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set<Category> categories = new HashSet<Category>(0);

	/**
	 * @return the categories
	 */
	public Set<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Stock() {
	}
 
	public Stock(String stockCode, String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
	}
 
	public Integer getStockId() {
		return this.stockId;
	}
 
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
 
	public String getStockCode() {
		return this.stockCode;
	}
 
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
 
	public String getStockName() {
		return this.stockName;
	}
 
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
