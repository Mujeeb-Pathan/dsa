package com.fusion.dsa.recursion;

/**
 * A utility class for calculating numbers in the Fibonacci sequence.
 * This class uses a standard recursive approach to find the nth number.
 */
public class Fibonacci {

	/**
	 * Calculates the nth number in the Fibonacci sequence using recursion.
	 * * <p>The Fibonacci sequence starts with 0 and 1, and each subsequent
	 * number is the sum of the previous two (0, 1, 1, 2, 3, 5, 8, ...).
	 * * <p><b>Example Usage:</b>
	 * <pre>
	 * {@code
	 * int result5 = Fibonacci.fibonacci(5); // Returns 5
	 * int result7 = Fibonacci.fibonacci(7); // Returns 13
	 * }
	 * </pre>
	 *
	 * @param n the position in the Fibonacci sequence to calculate (0-indexed).
	 * @return the Fibonacci number at the nth position. Returns -1 if n is negative.
	 */
	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}

		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main() {
		System.out.println(fibonacci(10));
	}
}
