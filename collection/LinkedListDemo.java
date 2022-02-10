package com.collection;
import java.util.LinkedList;
public class LinkedListDemo {
          
	public static void main(String[] args) {
		
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(115);
		l.add(121);
		l.add(11);
		
		System.out.println(l);
		
		l.isEmpty();
		System.out.println(l);
		l.add(34);
		System.out.println(l.get(5));
		
		System.out.println(l.contains(24));
		
		for(int x : l)
		{
			System.out.print(x+" ");
		}
		
		l.clear();
		System.out.println(l);
		
		
		
		
	          
	}
}
