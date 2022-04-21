package com.bridgelab.Day14;

import org.junit.Test;

import junit.framework.Assert;

public class UC9Test {

//		UC9 Method to check 40 in LinkedList and delete that node 
		public static Boolean uc9() {
			Boolean answer = null;
			LinkedListB uc9 = new LinkedListB();
			uc9.list.add(56);
			uc9.list.add(30);
			uc9.list.add(70);
			uc9.list.add(2, 40);
			System.out.println(uc9.list);
			System.out.println("Size of LinkedList="+uc9.list.size());
			
			for(int i=0;i<uc9.list.size();i++) {
				if(uc9.list.get(i).equals(40)) {
					answer=true;
					break;
				}
			}
			uc9.list.remove(2);
			System.out.println("\n"+uc9.list);
			System.out.println("Size of LinkedList="+uc9.list.size());
			return answer;
		}

		
//		UC9...TestCase
		@SuppressWarnings("deprecation")
		@Test
		public void testing() {
			Boolean expected=true;
			Assert.assertEquals(expected, uc9());
		}
}
