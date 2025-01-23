package com.tnsif.ifet.newassignment;
import java.util.Scanner;

//Custom exception class
class InvalidDataException extends Exception {
public InvalidDataException(String message) {
   super(message);
}
}

class Person {
	 protected String name;
	 protected int age;

	 public Person(String name, int age) throws InvalidDataException {
	     if (name == null || name.trim().isEmpty()) {
	         throw new InvalidDataException("Name cannot be empty.");
	     }
	     if (age <= 0 || age > 120) {
	         throw new InvalidDataException("Age must be between 1 and 120.");
	     }
	     this.name = name;
	     this.age = age;
	 }

	 public void displayDetails() {
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	 }

}
