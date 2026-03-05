package com.fusion.dsa.recursion;

/**
 * Problem: Factorial using Recursion
 * <p>
 * Approach:
 * - Multiply current number with factorial(n-1)
 * - Stop recursion when n == 0 or n == 1
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * <p>
 * Recursion Depth: n
 */
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
