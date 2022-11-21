/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeapp;

import javax.swing.JOptionPane;

/**
 *
 * @author fsheridan
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//basic employee
        Employee e1 = new Employee("Frances","12345","20/12/22");
        JOptionPane.showMessageDialog(null, "Name:"+e1.getName()+", ID:"+e1.getId()+", DOB:"+e1.getDob());
        
        //manager
        Manager m1 = new Manager(50000,"George","56789","12/12/88");
        JOptionPane.showMessageDialog(null,"Name:"+m1.getName()+", ID:"+m1.getId()+", DOB:"+m1.getDob()+", Salary:"+m1.getSalary());
        
        //Floor Staff
        FloorStaff f1 = new FloorStaff(12.75,"Max","34567","15/6/99");
        JOptionPane.showMessageDialog(null,"Name:"+f1.getName()+", ID:"+f1.getId()+", DOB:"+f1.getDob()+", Hourly Rate:"+f1.getHourlyRate());
    }
    
}
