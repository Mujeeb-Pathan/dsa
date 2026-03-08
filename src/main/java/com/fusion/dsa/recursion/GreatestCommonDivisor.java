package com.fusion.dsa.recursion;

/**
 * Utility class to calculate the Greatest Common Divisor (GCD)
 * of two integers using the Euclidean Algorithm.
 *
 * <p>The Greatest Common Divisor (GCD) is the largest positive
 * integer that divides both numbers without leaving a remainder.</p>
 *
 * <h3>Example</h3>
 * Find GCD of 48 and 18
 * <p>
 * Step 1:
 * gcd(48, 18)
 * 48 % 18 = 12
 * gcd(18, 12)
 * <p>
 * Step 2:
 * 18 % 12 = 6
 * gcd(12, 6)
 * <p>
 * Step 3:
 * 12 % 6 = 0
 * gcd(6, 0)
 * <p>
 * Step 4:
 * Base condition reached
 * <p>
 * Result:
 * GCD = 6
 *
 * <h3>Time Complexity</h3>
 * O(log(min(a,b)))
 *
 * <h3>Space Complexity</h3>
 * O(log(min(a,b))) due to recursion stack
 */
public class GreatestCommonDivisor {

	/**
	 * Calculates the GCD of two numbers using recursion.
	 *
	 * @param a first integer
	 * @param b second integer
	 * @return greatest common divisor of a and b
	 */
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);

	}

	static void main() {
		int num1 = 48;
		int num2 = 18;

		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));

		int num3 = 20;
		int num4 = 8;

		System.out.println("GCD of " + num3 + " and " + num4 + " is: " + gcd(num3, num4));

	}
}
