package com.demo.misc;

public class TestSum {

	public void findSumPair(int[] arr, int sum) {
		int l = 0;
		int m = arr.length - 1;

		while (l < m) {

			if (arr[l] + arr[m] > sum) {
				m--;

			} else if (arr[l] + arr[m] < sum) {
				l++;

			}

			else {
				System.out.println("sum is " + arr[l] + " " + arr[m]);
				l++;
				m--;
				break;
			}

		}

	}

	public static void main(String args[]) {

		int arr[] = { 1, 3, 4, 6, 7 };
		int sum = 7;

		TestSum ts = new TestSum();
		ts.findSumPair(arr, sum);

	}

}
