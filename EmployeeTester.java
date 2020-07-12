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
public class EmployeeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[3];
        
        employees[0] = new HourlyEmployee("Jason", 10);
        employees[1] = new SalaryEmployee("Steve", 30000);
        employees[2] = new Manager("Jose", 50000, 500);
        
        System.out.println(employees[0].getName());
        System.out.println("Expected: Jason");
        
        System.out.println(employees[0].weeklyPay(30));
        System.out.println("Expected: 300");
        
        System.out.println(employees[0].toString());
        System.out.println("Expected: "
                + "employeetester.HourlyEmployee"
                + "[name: Jason][hourlyPay: 10.0]");
        
        
        System.out.println(employees[1].weeklyPay(0));
        System.out.println("Expected: 625");
        
        System.out.println(employees[1].toString());
        System.out.println("Expected: "
                + "employeetester.SalaryEmployee"
                + "[name: Steve][annualSalary: 30000.0]");
        
        
        System.out.println(employees[2].weeklyPay(0));
        System.out.println("Expected: 1541");
        
        System.out.println(employees[2].toString());
        System.out.println("Expected: "
                + "employeetester.Manager"
                + "[name: Jose][annualSalary: 50000.0][bonus: 500.0]");
        
    }
    
}
