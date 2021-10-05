package com.test.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductComParble {
	public static void main(String[] args) {
		Product p1= new Product("ABC");
		Product p2= new Product("MDE");
		Product p3= new Product("AAA");
		Product p4= new Product("ABB");
		List <Product> lp = new ArrayList();
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);
		
		Collections.sort(lp,(p,m)->{
			return p.name.compareTo(m.name);
			    
		});
		
		Stream <Product> streamms =lp.stream().filter(p->p.name.startsWith("A"));
		
	}

}
