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
	private Set<StockDailyRecord> stockDailyRecords = 
			new HashSet<StockDailyRecord>(0);

 
	/**
	 * @return the stockDailyRecords
	 */
	public Set<StockDailyRecord> getStockDailyRecords() {
		return stockDailyRecords;
	}

	/**
	 * @param stockDailyRecords the stockDailyRecords to set
	 */
	public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
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
