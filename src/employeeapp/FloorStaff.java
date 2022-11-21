/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 *
 * @author fsheridan
 */
public class FloorStaff extends Employee{
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public FloorStaff(double hourlyRate, String name, String id, String dob) {
        super(name, id, dob);
        this.hourlyRate = hourlyRate;
    }

    public FloorStaff() {
        super();
        hourlyRate = 0;
    }
    
    
}
