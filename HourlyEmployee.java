/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetester;

/**
 *
 * @author leandroestevez
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyPay;

    /**
     * Constructs an hourly employee object.
     * @param name name of the employee
     * @param pay hourly pay of the employee
     */
    public HourlyEmployee(String name, double pay) {
        
        super(name);
        hourlyPay = pay;
        
    }

    /**
     * Sets the hourly pay of the employee.
     * @param hourlyPay
     */
    public void setHourlyPay(double hourlyPay) {
        
        this.hourlyPay = hourlyPay;
        
    }

    /**
     * Get the the hourly pay of the employee.
     * @return the hourly pay
     */
    public double getHourlyPay() {
        
        return hourlyPay;
        
    }
    
    /**
     * Calculates the week pay for the employee.
     * @param hoursWorked hours the employee worked
     * @return the pay for the week
     */
    @Override
    public double weeklyPay(int hoursWorked) {
        
        int overtime;
        double overtimePay;
        double weeklyPay;
        
        if(hoursWorked > 40) {
            
            overtime = hoursWorked - 40;
            overtimePay = overtime * (hourlyPay +  hourlyPay / 2);
            weeklyPay = 40 * hourlyPay;
            weeklyPay += overtimePay;
            
        } else {
            
            weeklyPay = hoursWorked * hourlyPay;
            
        }
        
        return weeklyPay;
        
    }
    
    @Override
    public String toString() {
        
        return super.toString() + "[hourlyPay: " + hourlyPay + "]";
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final HourlyEmployee other = (HourlyEmployee) obj;
        
        return Double.doubleToLongBits(this.hourlyPay) == Double.doubleToLongBits(other.hourlyPay);
        
    }
    
}
