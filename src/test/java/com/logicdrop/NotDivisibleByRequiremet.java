package com.logicdrop;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotDivisibleByRequiremet {
	LogicDropApp obj1 = new LogicDropApp();
	@Test
	public void test() {
		String result = obj1.Validation();
		
		if ((result.equals("Logic")) || (result.equals("drop")) || (result.equals("Logicdrop"))){
			fail();
		}
		
	}

}
