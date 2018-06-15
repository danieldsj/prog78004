/**
 * Written by Daniel de Sao Jose
 * 
 * Requirements:
 * - Display the total salary for assistant professors.
 * - Display the total salary for associate professors.
 * - Display the total salary for full professors.
 * - Display the total salary for all faculty.
 * - Create a class that represents the contract with the employee. 
 * - Use a try and catch statement in the solution.
 * 
 */

import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;

/**
 * Class used to represent a person with a name. 
 * 
 * @author daniel
 */
class Person extends Object {
    
    // Data fields.
    private String firstName;
    private String lastName;
    
    // A constructor asking for the values for some properties.
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Getters.
    public String getFirstName () {
        return this.firstName;
    }
    public String getLastName () {
        return this.lastName;
    }
}

/**
 * Class used to represent an employee with a position and salary.
 * 
 * @author daniel
 */
class Employee extends Person {
    
    // Some private properties.
    private String position;
    private Double salary;
    
    // A constructor that takes all properties, including those of superclass.
    public Employee(String firstName, String lastName, String position, 
            Double salary) {
        super(firstName, lastName);
        this.position = position;
        this.salary = salary;
    }
    
    // Getters
    public String getPosition() {
        return this.position;
    }
    
    public Double getSalary() {
        return this.salary;
    }
    
}

/**
 * Class representing a school with employees and budgets.
 * 
 * @author daniel
 */
class School extends Object {
    
    // Data fields.
    private EmployeeDatabase database;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private double totalAssistantSalary = 0;
    private double totalAssociateSalary = 0;
    private double totalFullSalary = 0;
    
    // Constructors.
    public School() throws Exception {
        database = new EmployeeDatabase(this);
        
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getPosition().equals("full")){
                this.totalFullSalary += this.employees.get(i).getSalary();
            } else if (this.employees.get(i).getPosition().equals("associate")) {
                this.totalAssociateSalary += this.employees.get(i).getSalary(); 
            } else if (this.employees.get(i).getPosition().equals("assistant")) {
                this.totalAssistantSalary += this.employees.get(i).getSalary();
            }
        }
    }
    
    // Getters for all of the properties.
    public double getTotalAssistantSalary(){
        return this.totalAssistantSalary;
    }
    
    public double getTotalAssociateSalary(){
        return this.totalAssociateSalary;
    }
    
    public double getTotalFullSalary(){
        return this.totalFullSalary;
    }
    
    // Returns the total of all employe totals.
    public double getTotalSalary(){
        return this.totalFullSalary + this.totalAssociateSalary + 
                this.totalAssistantSalary;
    }
    
    // Setter that adds an employee ot the list of employee.
    public void addEmployee(Employee e) {
        this.employees.add(e);
    }
}

/**
 * A class representing an online database that stores school employee data.
 * 
 * @author daniel
 */
class EmployeeDatabase extends ArrayList {
    
    private URL src; // Will represent the URL where the database resides.
    private Scanner reader; // Needed to read the file.
    
    // Constructor requires a school object so that it can populate the employee
    // list.
    public EmployeeDatabase(School school) throws Exception {
        src = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        reader = new Scanner(src.openStream());
        
        while (reader.hasNext()) {
            String line = reader.nextLine();
            String[] rows;
            rows = line.split(" ");

            school.addEmployee(new Employee(
                    rows[0], rows[1], rows[2], 
                    Double.parseDouble(rows[3])));
        }
    }
}


public class DanielAssignment4 {

    public static void main(String[] args) throws Exception {
        School school = new School();
        
        System.out.printf("Total full salary: $%.2f \n", 
                school.getTotalFullSalary());
        System.out.printf("Total associate salary: $%.2f \n", 
                school.getTotalAssociateSalary());
        System.out.printf("Total assistant salary: $%.2f \n", 
                school.getTotalAssistantSalary());
        System.out.printf("Total salary: $%.2f \n", 
                school.getTotalSalary());     
    }
}   