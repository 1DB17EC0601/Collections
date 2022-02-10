package com.Sample2;

public class AccessModifiers {
	
    public int age;
    public String name;
    public String gender;
    
    
    public AccessModifiers(int age, String name, String gender)
    {
         this.age=age;
         this.name=name;
         this.gender = gender;
    }
    
	public void display()
	{
		System.out.println("name: "+name+" age: "+age+" gender: "+gender);
		
	}
	

}
