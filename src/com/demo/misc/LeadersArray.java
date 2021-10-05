package com.demo.misc;

public class LeadersArray {
	private static void getLeaders(int arr[]){
		int size= arr.length;
		
		int leader = arr[size-1];
		System.out.println(leader);
		
		for (int i=size-1;i>=0; i--) {
			if (arr[i]>leader) {
				System.err.println(arr[i]);
				leader=arr[i];
			}
		}
		
	}

	public static void main(String[] args) {
		int arr []= {2,5,8,10,15,3,4};
		getLeaders(arr);
		
		
		
	}
}
