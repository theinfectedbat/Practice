package com.demo.misc;

public enum Languages {
	python(10*10);
	private int coders;
	private Languages(int p) {
		coders=p;
	}
	
	public int getCode () {
		return coders;
	}
public static void main(String[] args) {
	for (Languages l : Languages.values()) {
		System.out.println(l.getCode());
		
	}
}
}
