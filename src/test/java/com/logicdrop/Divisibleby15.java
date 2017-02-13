package com.logicdrop;

import static org.junit.Assert.*;

import org.junit.Test;

public class Divisibleby15 {
	LogicDropApp obj1 = new LogicDropApp();
	@Test
	public void test() {
		String result = obj1.Validation();
		assertEquals("logicdrop", result);
	}

}
