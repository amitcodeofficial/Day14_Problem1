package com.bridgelab.Day14;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UC7Test {

//	UC7 and UC8 Method
	public static Boolean uc7() {
		Boolean answer = null;
		LinkedListB uc7 = new LinkedListB();
		uc7.list.add(56);
		uc7.list.add(30);
		uc7.list.add(70);
		System.out.println(uc7.list);
		
//		UC8
		uc7.list.add(2, 40);
		System.out.println(uc7.list);
		
		for(int i=0;i<uc7.list.size();i++) {
			if(uc7.list.get(i).equals(30)) {
				answer=true;
				break;
			}
		}
		return answer;
	}

	
//	UC7...TestCase
	@SuppressWarnings("deprecation")
	@Test
	public void testing() {
		Boolean expected=true;
		Assert.assertEquals(expected, uc7());
	}

}
