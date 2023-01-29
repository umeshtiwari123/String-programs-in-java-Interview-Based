package com.Strings.ReverseAString;

public class ReverseStringUsingtoCharArray {

	public static void main(String[] args) {
		
		//Java Program to Reverse a String using toCharArray()
		
		String str="hello";
		
		char chArr[] = str.toCharArray();
		
		for(int i=chArr.length-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
		}
	}

}
