package com.logicdrop;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleBy3Test {

	LogicDropApp obj1 = new LogicDropApp();
	@Test
	public void test() {
			
				String result = obj1.Validation();
				assertEquals("Logic", result);
	}

}
