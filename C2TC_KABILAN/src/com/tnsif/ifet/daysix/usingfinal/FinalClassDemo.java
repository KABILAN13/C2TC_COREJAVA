package com.tnsif.ifet.daysix.usingfinal;
class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}


public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
		f1.show();
	}

}
