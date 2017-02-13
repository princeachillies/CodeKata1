package com.logicdrop;

import java.util.Scanner;

public class LogicDropApp {

	
	public static void main(String[] args) {
		LogicDropApp obj1 = new LogicDropApp();
		String finalresult = obj1.Validation();
		System.out.println(finalresult);
	}
	
	public String Validation(){
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter input number: ");
		int input = reader.nextInt();
		
		String result = Integer.toString(input);
		String x = "Logic";
		String y = "drop";
		String z = "logicdrop";
		
		
		if (((input%3) == 0) && (input < 15)){
			result = x;
		}
		else if (((input%5) == 0) && (input < 15)){
			result = y;
		}
		else if ((input%15) == 0){
			result = z;
		}
		
		else {
			result = result;
		}
		
		return result;
	}
}
