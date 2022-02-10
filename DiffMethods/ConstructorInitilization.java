package com.DiffMethods;

public class ConstructorInitilization {
	
	 String name;
	 int age;
	char grade;
	
	ConstructorInitilization(){
		 
		name="ravi";
		age=22;
		grade='c';
	}
	
	void display()
	{
		System.out.println(name+" "+age+" "+grade);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorInitilization s = new ConstructorInitilization();
	        s.display();
	}

	

}
