package com.demo.misc;

public class SecondLargest {
	private static int secondLargest(int[] arr) {
		int largest = 0;
		int res = 0;

		for (int i = 1; i < arr.length; i++)
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] < arr[largest]) {
				if (arr[i] > arr[res]) {
					res = i;
				}
			}
		return res;

	}

	public static void main(String[] args) {

		int arr[] = { 11, 10, 20, 5, 11, 6 };
		System.err.println(secondLargest(arr));
	}

}
