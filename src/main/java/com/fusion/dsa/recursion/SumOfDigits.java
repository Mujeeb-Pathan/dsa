package com.fusion.dsa.recursion;

/**
 * Utility class to calculate the sum of digits of a number using recursion.
 * <p>
 * Example:
 * Input: 12345
 * Output: 15
 * <p>
 * Explanation:
 * 12345 → 5 + 4 + 3 + 2 + 1 = 15
 */
public class SumOfDigits {

	/**
	 * Recursively calculates the sum of digits of a given number.
	 * <p>
	 * Approach:
	 * - Extract the last digit using (n % 10)
	 * - Add it to the result of the recursive call with remaining digits (n / 10)
	 * - Continue until n becomes 0
	 * <p>
	 * Example recursion flow for n = 12345:
	 * sum(12345)
	 * = 5 + sum(1234)
	 * = 5 + 4 + sum(123)
	 * = 5 + 4 + 3 + sum(12)
	 * = 5 + 4 + 3 + 2 + sum(1)
	 * = 5 + 4 + 3 + 2 + 1 + sum(0)
	 * = 15
	 * <p>
	 * Time Complexity:
	 * O(d) where d is the number of digits in the number.
	 * Each recursive call processes one digit.
	 * <p>
	 * Space Complexity:
	 * O(d) due to recursion stack depth.
	 *
	 * @param n the number whose digits will be summed
	 * @return sum of digits of n
	 */
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}

		return (n % 10) + sum(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(sum(12345));
	}
}