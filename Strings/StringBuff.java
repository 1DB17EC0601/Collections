package com.Strings;

public class StringBuff {
	
	public static void main(String[] args) {
		
		String s = new String("hello world");
		
		StringBuffer str = new StringBuffer(s);
		
		
		System.out.println(s);
	System.out.println(str);
		
		str.append(" "+'c');
		System.out.println(str);
		str.append('d');
	    System.out.println(str);
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.indexOf("m", 2));
		System.out.println(str);
		
		
	}

}
