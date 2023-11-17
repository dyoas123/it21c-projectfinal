/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import java.time.LocalDate;
/**
 *
 * @author admin
 * 
 
 */
public class Employee {
     String name;
    int salary;
    LocalDate hiredate;

    public Employee(String name, int salary, LocalDate hiredate) {

        this.name = name;
        this.salary = salary;
         this.hiredate = hiredate; 
    }
}