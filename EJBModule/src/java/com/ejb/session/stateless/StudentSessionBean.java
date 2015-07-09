/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.session.stateless;

import com.ejb.session.stateless.vo.Student;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author vpoli
 */
@Stateless

public class StudentSessionBean implements StudentSessionBeanRemote {

    private List<Student> students;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public StudentSessionBean(){
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student student){
        System.out.println(student);
        students.add(student);
    }
    
    public List<Student> getStudents(){
        return students;
    }
    
}
