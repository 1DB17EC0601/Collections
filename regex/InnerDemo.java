package com.regex;

public class InnerDemo {
	
	private String name;
	private int age;
	private String a="java";
	
	
	InnerDemo(String name, int age)
	{
       this.age= age;
       this.name=name;
	}
	
	void display()
	{
		System.out.println(a+" welcome to inner class");
	}
	
	class Inner
	{
		void display()
		{
			System.out.println("The Inner class getting executed");
		}
	}
	
	public static void main(String[] args) {
		
		InnerDemo d = new InnerDemo("chandru", 45);
		
		d.display();
		InnerDemo.Inner s=d.new Inner();
		s.display();
	}

}
