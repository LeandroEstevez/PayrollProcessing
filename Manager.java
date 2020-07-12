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
public class Manager extends SalaryEmployee {
    
    private double bonus;
    
    /**
     * Constructs a manager employee object.
     * @param name name of the manager
     * @param salary salary of the manager
     * @param bonus bonus of the manager
     */
    public Manager(String name, double salary, double bonus) {
        
        super(name, salary);
        this.bonus = bonus;
        
    }

    /**
     * Sets the bonus.
     * @param bonus bonus of the manager
     */
    public void setBonus(double bonus) {
        
        this.bonus = bonus;
        
    }

    /**
     * Get the bonus.
     * @return bonus of the manager 
     */
    public double getBonus() {
        
        return bonus;
        
    }

    /**
     * Calculates the week pay for the employee.
     * @param hoursWorked hours the employee worked
     * @return the pay for the week
     */
    @Override
    public double weeklyPay(int hoursWorked) {
        
        double weeklyPay = super.weeklyPay(hoursWorked) + bonus;
        
        return weeklyPay;
        
    }
    
    @Override
    public String toString() {
        
        return super.toString() + "[bonus: " + bonus + "]";
        
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
        
        final Manager other = (Manager) obj;
        
        return Double.doubleToLongBits(this.bonus) == Double.doubleToLongBits(other.bonus);
        
    }
  
}
