/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.session.stateless;

import com.ejb.session.stateless.vo.Student;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author vpoli
 */
@Remote
public interface StudentSessionBeanRemote {
        public void addStudent(Student student);
        public List<Student> getStudents();
}
