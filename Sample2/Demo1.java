package com.Sample2;

public class Demo1 {
	
	int id;
	String name;
	
	Demo1()
	{
	System.out.println("non parameterised constructor");
	}
	
	Demo1(int id, String name)
	{
		System.out.println("parameterised constructor");
	this.id = id;
	this.name = name;
	}

}
