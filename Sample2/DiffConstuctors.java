package com.Sample2;

public class DiffConstuctors {
	int age;
	String name;
	
	DiffConstuctors()
	{
		System.out.println("Default Constructor");
	}
	
	DiffConstuctors(int age, String name)
	{
		this.age= age;
		this.name=name;
		System.out.println("Parameterised constructor");
	}
	
	
	
	public static void main(String[] args)
	{
		DiffConstuctors n = new DiffConstuctors();
		System.out.println("Default constructor values "+ n.age+" with a name "+n.name);
		DiffConstuctors n1 = new DiffConstuctors(22, "abhi");
		System.out.println("Parameterised constructor values "+ n.age+" with a name "+n.name);
	}
	    
}
