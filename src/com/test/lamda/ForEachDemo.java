package com.test.lamda;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	
	  public static void main(String[] args) {  
          
	        List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        
	        list.forEach(  
	                n->System.out.println(n)  
	            );  
	        
				/*
				 * Collection.sort (list,(p1,p2)->{
				 * 
				 * })
				 * 
				 * Runnable r1=()->{
				 * 
				 * }
				 * 
				 *
				 * 
				 *   // using lambda to filter data  
               Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
				 */
	        
	        
	  }

}
