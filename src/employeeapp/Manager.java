/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 *
 * @author fsheridan
 */
public class Manager extends Employee{
    private double salary;

    public Manager(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }

    public Manager() {
        super();
        salary = 0;
    }
       
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
