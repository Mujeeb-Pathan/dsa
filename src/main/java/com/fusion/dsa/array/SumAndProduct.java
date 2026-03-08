package com.fusion.dsa.array;

public class SumAndProduct {

	/**
	 * Calculates the sum and product of all elements in the given array.
	 *
	 * <p><b>Example:</b></p>
	 * <p>
	 * Input:
	 * arr = {1, 2, 3, 4}
	 * <p>
	 * Step-by-step:
	 * <p>
	 * Iteration 1:
	 * sum = 0 + 1 = 1
	 * product = 1 * 1 = 1
	 * <p>
	 * Iteration 2:
	 * sum = 1 + 2 = 3
	 * product = 1 * 2 = 2
	 * <p>
	 * Iteration 3:
	 * sum = 3 + 3 = 6
	 * product = 2 * 3 = 6
	 * <p>
	 * Iteration 4:
	 * sum = 6 + 4 = 10
	 * product = 6 * 4 = 24
	 * <p>
	 * Final Result:
	 * Sum = 10
	 * Product = 24
	 *
	 * <h3>Time Complexity</h3>
	 * O(n)
	 * Because the array is traversed once.
	 *
	 * <h3>Space Complexity</h3>
	 * O(1)
	 * Only two variables (sum and product) are used regardless of input size.
	 *
	 * @param array input array
	 */
	public static void findSumAndProduct(int[] array) {
		int size = array.length;
		int sum = 0, product = 1;

		for (int i = 0; i < size; i++) {
			sum += array[i];
			product *= array[i];
		}

		System.out.println("Sum :" + sum);

		System.out.println("Product :" + product);
	}

	static void main() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		findSumAndProduct(array);
	}
}
