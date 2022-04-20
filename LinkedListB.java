package com.bridgelab.Day14;

import java.util.LinkedList;

public class LinkedListB {
	
	public LinkedList<Integer> list = new LinkedList<Integer>();
	
//	Method for UC1 to create a simple LinkedList of 56,30,70
	public static void UC1() {
		LinkedListB uc1 = new LinkedListB();
		uc1.list.add(56);
		uc1.list.add(30);
		uc1.list.add(70);
		
		System.out.println(uc1.list);
	}
	
//	Method for UC2 to Create a LinkedList by adding 30 and 56 to 70
	public static void UC2() {
		LinkedListB uc2 = new LinkedListB();
		uc2.list.add(70);
		uc2.list.addFirst(30);
		uc2.list.addFirst(56);
		
		System.out.println(uc2.list);
	}
	
	public static void main(String[] args) {
//		UC1 Method
		UC1();
		
//		UC2 Method
		UC2();
	}

}
