package com.map;
import java.util.*;
public class LinkedHashMap {
	
	public static void main(String[] args) {
		
		//HashMap
		
		System.out.println("\n HashMap Example");
		System.out.println();
		HashMap<Integer, String> s= new HashMap<Integer, String>();
	
		s.put(9, "Mango");
		s.put(8, "Graphes");
		s.put(7, "banana");
		
		Set<Integer> setofkeys = s.keySet();
		
      for(int key: setofkeys)
		{
		System.out.println(key+" "+s.get(key));
		}
		
      
      System.out.println("\n HashMap Example");
      System.out.println();
	      for(Map.Entry m:s.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
                  System.out.println("\n HashTable Example");
                  System.out.println();
		
		//HashTable
	      
	      Hashtable<Double, String> ht = new Hashtable<Double, String>();
	      
	      ht.put(80000.00, "splender");
	      ht.put(180000.00, "pulsur");
	      ht.put(120000.00, "duke");
	      ht.put(50000.00, "XL Super");
	      ht.put(5000.00, "BiCycle");
	      
	      
	      //traversing using the for each loop
	      
	      Set<Double> vehicle = ht.keySet();
	      
	      for(double s1 : vehicle)
	      {
	    	  System.out.println(s1+"\t "+ht.get(s1));
	      }
	      
		System.out.println();
		//tree map
	      
	      
	      TreeMap<Integer, String>  l= new TreeMap<Integer, String>();
	      
	      l.put(20, "banana");
	      l.put(30, "apple");
	      l.put(50, "butterfruit");
	      l.put(60, "watermelon");
	      
	      
	      Set<Integer> keys = l.keySet();
	      
	      for(int Fruits:keys)
	      {
	    	  System.out.println(Fruits+"\t "+l.get(Fruits));
	      }
	           
	}

}
