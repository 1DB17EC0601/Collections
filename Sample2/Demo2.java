package com.Sample2;

public class Demo2 extends Demo1{
	
	int age;
	double salary;
      Demo2(int age, double salary)
      {
    	  super(22, "ningu");
    	  
    	  System.out.println("Sub class constructor");
    	  this.age=age;
    	  this.salary=salary;
    	  
      }
      
      Demo2()
      {
    	  System.out.println("subclass non parameterised constructor");
      }
      
      public static void main(String[] args)
      {
    	  Demo2 d1 = new Demo2();
    	  System.out.println("main method is running");
    	  Demo2 d2 = new Demo2(34, 34000.00);
    	  System.out.println("age is "+d2.age+"the salary "+d2.salary);
    	  System.out.println("id is "+d1.id+"the name "+d1.name);
    	  
    	  
      }
}
