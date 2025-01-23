package com.tnsif.ifet.newassignment;
import java.util.Scanner;
public class EmployeeDetailsCollector {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	     try {
	         System.out.print("Enter name: ");
	         String name = scanner.nextLine();

	         System.out.print("Enter age: ");
	         int age = scanner.nextInt();
	         scanner.nextLine(); // Consume newline

	         System.out.print("Enter employee ID: ");
	         String employeeId = scanner.nextLine();

	         System.out.print("Enter designation: ");
	         String designation = scanner.nextLine();

	         System.out.print("Enter salary: ");
	         double salary = scanner.nextDouble();

	         // Create Employee object
	         Employee employee = new Employee(name, age, employeeId, designation, salary);

	         // Display employee details
	         System.out.println("\nEmployee Details:");
	         employee.displayDetails();

	     } catch (InvalidDataException e) {
	         System.out.println("Error: " + e.getMessage());
	     } catch (Exception e) {
	         System.out.println("An unexpected error occurred: " + e.getMessage());
	     } finally {
	         scanner.close();
	     }
	 }

}
