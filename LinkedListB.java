package com.bridgelab.Day14;

import java.util.LinkedList;

public class LinkedListB {
	
	public LinkedList<Integer> list = new LinkedList<Integer>();
	
//	Method for UC1 to create a simple LinkedList of 56,30,70
	public static void UC1() {
		LinkedListB uc1 = new LinkedListB();
		uc1.list.add(56);
		System.out.println("UC1="+uc1.list);
		uc1.list.add(30);
		System.out.println("UC1="+uc1.list);
		uc1.list.add(70);
		System.out.println("UC1="+uc1.list);
	}
	
//	Method for UC2 to Create a LinkedList by adding 30 and 56 to 70
	public static void UC2() {
		LinkedListB uc2 = new LinkedListB();
		uc2.list.add(70);
		System.out.println("UC="+uc2.list);
		uc2.list.addFirst(30);
		System.out.println("UC="+uc2.list);
		uc2.list.addFirst(56);
		System.out.println("UC="+uc2.list);
	}
	
//	Method for UC3 to Create a LinkedList by appending 30 and 70 to 56
	public static void UC3() {
		LinkedListB uc3 = new LinkedListB();
		uc3.list.add(56);
		System.out.println("UC3="+uc3.list);
		uc3.list.addLast(30);
		System.out.println("UC3="+uc3.list);
		uc3.list.addLast(70);
		System.out.println("UC3="+uc3.list);
	}
	
//	Method for UC4 Ability to insert 30 between 56 and 70
	public static void UC4() {
		LinkedListB uc4 = new LinkedListB();
		uc4.list.add(56);
		uc4.list.add(70);
		System.out.println("UC4="+uc4.list);
		uc4.list.add(1, 30);
		System.out.println("UC4="+uc4.list);
	}
	
	public static void main(String[] args) {
//		UC1 Method
		UC1();
		
//		UC2 Method
		System.out.println();
		UC2();
		
//		UC3 Method
		System.out.println();
		UC3();
		
//		UC4 Method
		System.out.println();
		UC4();
	}

}
