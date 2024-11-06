//Program to demonstrate static variables
package com.tnsif.ifet.daysix.staticvariable;

public class EmployeeDemo {
	public static void main(String[] args) {
	Employee e = new Employee("Shubh", 123);
	System.out.println(e);
	
	// Similarly, create the second object of the class and pass the two arguments.
	e = new Employee("Deep", 321);
	System.out.println(e);
}
}
