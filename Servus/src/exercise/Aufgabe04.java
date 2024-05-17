package exercise;

/*
 *  Copyright (C) 2022 Christian Knorr, Simon Lenz.
 *  All rights reserved.
 */

public class Aufgabe04 {

	public static int compareInt(int a, int b) {
		int result = 0;

		// TODO add solution here
		// result = 0: for a equals b
		if (a == b) {
			System.out.println(result = 0);
		}
		// result = 1: for a greater b
		else if (a > b) {
		System.out.println(result = 1);
		}
		// result = 2: for b greater a
		else if (a < b) {
			System.out.println(result = 2);
		}
		return result;
	}

	public static void main(String[] args) {
		// *** variable declaration ***
		int a, b;

		// *** program header ***
		System.out.println("Number Comparison");
		System.out.println("-----------------");

		// *** data input ***
		System.out.print("Enter first number:  ");
		a = SystemInReader.readInt();
		System.out.print("Enter second number: ");
		b = SystemInReader.readInt();

		System.out.println("Result is " + compareInt(a, b) + ".");
	}

}