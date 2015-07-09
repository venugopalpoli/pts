/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbclient;

import com.ejb.session.stateless.StudentSessionBeanRemote;
import com.ejb.session.stateless.vo.Student;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author vpoli
 */
public class EJBClient {

    BufferedReader brConsoleReader = null; 
    Properties props;
    InitialContext ctx;
    
   public EJBClient()
   {
      props = new Properties();
      try {
      props.load(new FileInputStream("JNDI.properties"));
      } catch (IOException ex) {
      ex.printStackTrace();
      }
      try {
      ctx = new InitialContext(props);            
      } catch (NamingException ex) {
      ex.printStackTrace();
      }
      brConsoleReader = 
      new BufferedReader(new InputStreamReader(System.in));
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EJBClient eJBClient = new EJBClient();
       eJBClient.testEJB();
    }
    
    private void testEJB(){
       try {
         
           StudentSessionBeanRemote studentBean = (StudentSessionBeanRemote)ctx.lookup("StudentSessionBean/remote");
           
           Student student = new Student();
           student.setLocation("London");
           student.setName("Venu");
           
          // studentBean.addStudent(student);
           
           StudentSessionBeanRemote studentBean1 = (StudentSessionBeanRemote)ctx.lookup("StudentSessionBean/remote");
           
           System.out.println(studentBean1.getStudents());
           
           
      } catch (Exception e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
      }finally {
         try {
            if(brConsoleReader !=null){
               brConsoleReader.close();
            }
         } catch (IOException ex) {
            System.out.println(ex.getMessage());
         }
      }
    }
}
