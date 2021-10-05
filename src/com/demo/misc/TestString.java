package com.demo.misc;

public class TestString {

	public static void main(String[] args) {
		String evenString = "";
		String S = "This is a sample";

		String[] evenStrin = S.split(" ");

		for (int i = 0; i < evenStrin.length; i++) {
			if (evenStrin[i].length() % 2 == 0) {
				evenString = evenStrin[i].length() > evenString.length() ? evenStrin[i] : evenString;

			}
		}
		System.out.println(evenString);
	}
}
