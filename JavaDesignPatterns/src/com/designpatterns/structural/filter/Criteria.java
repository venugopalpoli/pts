/**
 * 
 */
package com.designpatterns.structural.filter;

import java.util.List;

/**
 * @author vpoli
 *
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
