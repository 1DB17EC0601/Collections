package com.DiffMethods;

public class ConstuctorInitialisation {
	
	int age;
	String name;
	double salary;
	
	ConstuctorInitialisation(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println(name+" "+salary+" "+age);
	}
	
	public static void main(String[] args) {
		
		ConstuctorInitialisation n = new ConstuctorInitialisation(22,"chandrashekhar", 34000.00);
		
		n.display();
	}

}
