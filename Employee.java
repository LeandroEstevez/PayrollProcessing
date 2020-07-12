/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetester;

import java.util.Objects;

/**
 *
 * @author leandroestevez
 */
public abstract class Employee {
    
    private final String name;
    
    /**
     * Constructs an employee object with a name.
     * @param name name of the employee.
     */
    public Employee(String name) {
        
        this.name = name;
        
    }

    /**
     * Gets the name of the employee.
     * @return the name of the employee.
     */
    public String getName() {
        
        return name;
        
    }
    
    /**
     * Calculates the week pay for the employee.
     * @param hoursWorked hours the employee worked.
     * @return the pay for the week.
     */
    public abstract double weeklyPay(int hoursWorked);
    
    @Override
    public String toString() { 
        
        return getClass().getName() + "[name: " + name + "]";  
        
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
        
        final Employee other = (Employee) obj;
        
        return Objects.equals(this.name, other.name);
        
    }
    
    
    
}
