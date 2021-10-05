package com.demo.misc;

public class RemoveDuplicate {

	private static int removeDuplicate(int[] arr) {
		int res = 1;
		int dup=0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res]= arr[i];
				res++;
			}
			else {
				dup++;
			}

		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 10,20,20,30,30};
		System.out.println(removeDuplicate(arr));
		
	}

}
