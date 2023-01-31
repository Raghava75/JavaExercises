package com.demo;

public class EmployeeTest {

    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");
        Employee empThree = new Employee("Mary Anne");
        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        empThree.empAge(28);
        empThree.empDesignation("Architect Engineer");
        empThree.empSalary(500000);
        empThree.printEmployee();
    }
}
