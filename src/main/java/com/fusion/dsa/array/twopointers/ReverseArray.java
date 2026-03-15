package com.fusion.dsa.array.twopointers;

import java.util.Arrays;

public class ReverseArray {

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
		System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })));
	}
}
