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
public class SalaryEmployee extends Employee {
    
    private double annualSalary;

    /**
     * Constructs a salary employee object.
     * @param name name of the employee
     * @param salary salary of the employee
     */
    public SalaryEmployee(String name, double salary) {
        
        super(name);
        annualSalary = salary;
        
    }

    /**
     * Sets the salary of the employee.
     * @param annualSalary
     */
    public void setAnnualSalary(double annualSalary) {
        
        this.annualSalary = annualSalary;
        
    }

    /**
     * Get the the salary of the employee.
     * @return the hourly pay
     */
    public double getAnnualSalary() {
        
        return annualSalary;
        
    }

    /**
     * Calculates the week pay for the employee.
     * @param hoursWorked hours the employee worked
     * @return the pay for the week
     */
    @Override
    public double weeklyPay(int hoursWorked) {
        
        double monthlyPay = annualSalary / 12;
        
        double weeklylyPay = monthlyPay / 4;
        
        return weeklylyPay;
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "[annualSalary: " + annualSalary + "]";
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
        
        final SalaryEmployee other = (SalaryEmployee) obj;
        
        return Double.doubleToLongBits(this.annualSalary) == Double.doubleToLongBits(other.annualSalary);
        
    }
       
}
