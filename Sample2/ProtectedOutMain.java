package com.Sample2;

import com.Sample1.ProtectedClass;

public class ProtectedOutMain extends ProtectedClass {

	
	
	public ProtectedOutMain(int age, String name, double string) {
		
		super(22,"mallappa", 34000.00);
	}

	//Accessing outside the class with inheritance
    public static void main(String[] args) {
		
    	ProtectedOutMain s = new ProtectedOutMain(23,"mallapa", 34000.00);
   	 
   	 s.display();
}
}
