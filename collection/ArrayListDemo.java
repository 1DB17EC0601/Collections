package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> s = new ArrayList<String>();
		   s.add("malps");
		   s.add("vinay");
		   s.add("venki");
		   s.add("divakar");
		   s.add("sudheer");
		   s.add("ashok");
		   s.add("vinnu");
		   s.add("malps");
		   System.out.println(s);
		   
		   
		   s.add(2,"ningu");
		   
		   System.out.println(s);
		   
		   s.remove(2);
		   s.remove(4);
		   s.remove(5);
		   System.out.println(s);	
		   
		   System.out.println( s.get(4));
		   
		   System.out.println( s.isEmpty());
		   
		   System.out.println(s.contains("malps"));
		   
		   s.clear();
		   System.out.println( s.isEmpty());
		   System.out.println(s);
		   
		  
		   
		  
		   
		   
		
	}

}
