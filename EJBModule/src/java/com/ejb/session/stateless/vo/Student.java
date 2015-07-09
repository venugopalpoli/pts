/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.session.stateless.vo;

import java.io.Serializable;

/**
 *
 * @author vpoli
 */
public class Student implements Serializable{
    
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nName : " + this.name);
        stringBuilder.append("\nLocation : " + this.location);
        return stringBuilder.toString();
    }
}
