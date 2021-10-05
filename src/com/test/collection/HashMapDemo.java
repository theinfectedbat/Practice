package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> l = new HashMap<Integer, String>();

		l.put(100, "A");
		l.put(101, "B");
		l.put(102, "C");
		Iterator<Map.Entry<Integer, String>> t = l.entrySet().iterator();
		
		Entry e1=t.next();

		Iterator<Integer> it = l.keySet().iterator();
		
		//Set<Entry<Integer, String>> e=l.entrySet();

		List<Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(l.entrySet());
		list.forEach(n->{
			System.out.println(n);
			
		});
		
		int [] arr = {1,2,3,4};
		
		
	
		
		
		  l.forEach((k,v)->{ System.out.println(v);
		  
		  });
		  Runnable r1=()->{
			  System.out.println();
			  
		  };
		  
		  Collections.sort(list,(i1,i2)->{
			  return 0;
		  });
		  
		  
		 

		/*
		 * // Sort the list using lambda expression Collections.sort( list, (i1, i2) ->
		 * i1.getValue().compareTo(i2.getValue()));
		 */

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

		/*
		 * List<Integer> cp= new ArrayList<>(); cp.add(5); ListIterator<Integer> it=
		 * cp.listIterator();
		 * 
		 * while (it.hasNext()) { int i = (int) it.next(); cp.add(10); }
		 * 
		 * Hashtable<Long, Long> locked = new Hashtable<Long, Long>(); Enumeration
		 * en=locked.elements();
		 */

	}

}
