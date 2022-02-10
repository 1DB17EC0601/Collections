package com.Strings;

public class StringBuilder {
	
	public static void main(String[] args) {
		
		
		String s = new String("Water boy");
		
		StringBuffer m = new StringBuffer(s);
		
		m.append(true);
		
		m.append(10);
		System.out.println(s);
		
		
		m.insert(9, " ");
		m.insert(14, " ");
		
		System.out.println(m);
		
		System.out.println(m.reverse());
		
		System.out.println(m.replace(2, 9, "malps"));
		System.out.println(m.reverse());
		
		
		
	
	}

}
