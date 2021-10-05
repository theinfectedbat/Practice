package com.test.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SortArray {
	
static Integer[] arr = { 2, 5, 2, 8, 5, 6, 8, 8 };
	

	// Driver Code
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(arr);
		sortBasedOnFrequencyAndValue(list);
	}


	private static void sortBasedOnFrequencyAndValue(List<Integer> list) {
		final HashMap<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
		final HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
		int ctr=0;
		
		list.forEach(n->{
			if (mapCount.get(n)==null) {
				mapCount.put(n, 1);
				mapIndex.put(n,ctr);
			
			}
		});
		
		
		
		
	}

}