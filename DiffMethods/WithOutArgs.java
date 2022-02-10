package com.DiffMethods;

public class WithOutArgs {
	int x=10;
	double y=889.09;
	public void cir()
	{
		
		System.out.println("method is running");
		System.out.println("the result is ");
	}
	
	
	public static void main(String[] args)
	{
		WithOutArgs a=new WithOutArgs();
		System.out.println(a.y);
		System.out.println(a.x);
		a.cir();
	}

}
