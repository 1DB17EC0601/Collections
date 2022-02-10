package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] args) {
		
		String pattern = "[^xyz]+";
		String check =  "Regular epressions";
		
		
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		
			try {
				if(c.matches())
				{
				System.out.println("pattern matched");
				}
				else {
					System.out.println("pattern not matched");
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid");
			}
			
			}	

	}


