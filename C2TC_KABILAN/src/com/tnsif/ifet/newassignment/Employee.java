package com.tnsif.ifet.newassignment;

public class Employee extends Person {
	private String employeeId;
	 private String designation;
	 private double salary;

	 public Employee(String name, int age, String employeeId, String designation, double salary)
	         throws InvalidDataException {
	     super(name, age);
	     if (employeeId == null || employeeId.trim().isEmpty()) {
	         throw new InvalidDataException("Employee ID cannot be empty.");
	     }
	     if (designation == null || designation.trim().isEmpty()) {
	         throw new InvalidDataException("Designation cannot be empty.");
	     }
	     if (salary <= 0) {
	         throw new InvalidDataException("Salary must be greater than zero.");
	     }
	     this.employeeId = employeeId;
	     this.designation = designation;
	     this.salary = salary;
	 }

	 @Override
	 public void displayDetails() {
	     super.displayDetails();
	     System.out.println("Employee ID: " + employeeId);
	     System.out.println("Designation: " + designation);
	     System.out.println("Salary: " + salary);
	 }
}
