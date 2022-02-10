package com.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String > s= new HashMap<Integer, String>();
		
		s.put(1, "mallappa");
		s.put(2, "vinay s");
		s.put(3, "naveen");
		s.put(4, "Bharath");
		s.put(5, "Chandru");
		s.put(6, "malappa");
		s.put(3, "malappa");
		
		
		System.out.println(s+" ");
		System.out.println(s.isEmpty());
		
		System.out.println(s.get(1));
		
		System.out.println(s.containsValue("mallappa"));
		
		Set<Integer> setofkeys = s.keySet();
		
		for(int key : setofkeys)
		{
			System.out.print(key+ "    "+s.get(key));
			
			System.out.println("\t"+key);
		}

}
}
