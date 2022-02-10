package com.regex;

public class InnerClassDemo2 {
     
	
	private String name="malappa_poojari";
	private int age= 34;
	
	void display()
	{
		System.out.print(name+" is "+age+" years old ");
	
	
	class Innerclass{
		
		private double salary = 34000.0;
		
		void display()
		{
			System.out.println("having a salary of "+salary);
		}
	}
	Innerclass n= new Innerclass();
	n.display();
	}
	
	public static void main(String[] args) {
		
		InnerClassDemo2 p = new InnerClassDemo2();
		
		p.display();
	}
}

