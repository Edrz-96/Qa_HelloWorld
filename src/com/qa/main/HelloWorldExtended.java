package com.qa.main;

public class HelloWorldExtended {

//    Store "Hello World!" in a variable and then output it to the console.

//    

	public static void main(String[] args) {
//	    Output "Hello World!" to the console.
		System.out.println("Hello World!");
//		Store "Hello World!" in a variable and then output it to the console.
		String e = "Hello World!";
		System.out.println(e);
//	    Create a method that takes a String as a parameter, and then outputs it to the console.
		methodTwo("Hello World");
//		Modify your method to return a String once called, which you then use to output to the console.
		System.out.println(methodThree("Hello World!"));

	}

	public static void methodOne() {
		String msg = "Hello World";
		System.out.println(msg);
	}

	public static void methodTwo(String input) {
		System.out.println(input);
	}

	public static String methodThree(String input) {
		return input;
	}
}
