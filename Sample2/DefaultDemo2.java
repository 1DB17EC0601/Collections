package com.Sample2;

import com.Sample1.DefaultDemo1;

 class DefaultDemo2 {
	public static void main(String[] args) {
		//accessing the default class outside the package that is not possible
		 DefaultDemo1 s = new DefaultDemo1(22, "mallappa",3400.00);
				s.display();
		
		
	}

}
