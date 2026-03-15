package com.fusion.dsa.array.twopointers;

import java.util.Arrays;

/**
 * Utility class to reverse an array using the Two Pointer technique.
 *
 * <p>The algorithm uses two pointers:</p>
 * <ul>
 *     <li>One pointer starts from the beginning (left)</li>
 *     <li>One pointer starts from the end (right)</li>
 * </ul>
 *
 * <p>The elements at these pointers are swapped and the pointers move
 * toward each other until they meet.</p>
 *
 * <h3>Example</h3>
 * <p>
 * Input Array:
 * [1, 2, 3, 4, 5]
 * <p>
 * Step 1:
 * left = 0 (1)
 * right = 4 (5)
 * <p>
 * swap(1,5)
 * <p>
 * Array becomes:
 * [5, 2, 3, 4, 1]
 * <p>
 * Step 2:
 * left = 1 (2)
 * right = 3 (4)
 * <p>
 * swap(2,4)
 * <p>
 * Array becomes:
 * [5, 4, 3, 2, 1]
 * <p>
 * Step 3:
 * left = 2
 * right = 2
 * <p>
 * left == right → stop
 * <p>
 * Final Output:
 * [5, 4, 3, 2, 1]
 *
 * <h3>Example 2</h3>
 * <p>
 * Input:
 * [1,2,3,4,5,6]
 * <p>
 * Output:
 * [6,5,4,3,2,1]
 *
 * <h3>Time Complexity</h3>
 * O(n)
 * <p>
 * Because the algorithm traverses roughly half the array,
 * but Big-O ignores constants.
 * <p>
 * Operations performed ≈ n/2 swaps
 * <p>
 * O(n/2) → O(n)
 *
 * <h3>Space Complexity</h3>
 * O(1)
 * <p>
 * The array is reversed in-place using only a temporary variable.
 */
public class ReverseArray {

	/**
	 * Reverses the given array in-place using the two-pointer technique.
	 *
	 * @param array the input array
	 * @return the reversed array
	 */
	public static int[] reverseArray(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}

		return array;
	}

	static void main() {
		System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
	}
}
