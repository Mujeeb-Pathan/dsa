package com.fusion.dsa.recursion;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main() {
		System.out.println(factorial(5)); // Output: 120
	}
}
