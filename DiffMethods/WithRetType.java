package com.DiffMethods;

public class WithRetType {
	
	int a=20;
	double b=20.98;
	
	public static int A1(int a, int b)
	{
		System.out.println("the method A1 with return type is running");
		return a+b;
	}
	
	public double B1(int x, double y)
	{
		System.out.println("the method B1 with return type is running");
		return x+y;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("main method is running");
		WithRetType r = new WithRetType();
		System.out.println(r.a+"\n "+r.b);
		
		System.out.println(WithRetType.A1(110,3));
		int s= WithRetType.A1(110,3);
		System.out.println(s);
		System.out.println(r.B1(12,540.3));
	}

}
