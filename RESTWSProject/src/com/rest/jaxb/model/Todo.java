/**
 * 
 */
package com.rest.jaxb.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
// Isn't that cool?
public class Todo {
  private String name;
  private String street;
  private String city;
  public Todo (String id, String summary){
	    this.name = id;
	    this.street = summary;
	  }

  public Todo(){
	  
  }
  public String getSummary() {
    return street;
  }
  public void setSummary(String summary) {
    this.street = summary;
  }
  public String getDescription() {
    return city;
  }
  public void setDescription(String description) {
    this.city = description;
  }
  public String getId() {
	return name;
  }
  public void setId(String id) {
	this.name = id;
  }
}
