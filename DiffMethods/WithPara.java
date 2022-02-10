package com.DiffMethods;

public class WithPara {
	int x=20;
	double y=40.45;
	public void para(int a, int b)
	{
	System.out.println("the method with parameter is runnig");	
	int result = a+b;
	System.out.println("addition of two no is "+result);
	}
	
	
	public static void main(String[] args)
	{
		WithPara p =new WithPara();
		System.out.println(p.x+" "+p.y);
		p.para(3,5);
		
	}

}
