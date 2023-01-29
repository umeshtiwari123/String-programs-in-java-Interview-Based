package com.tcs.Program1;

public class ReverseUsingcharAt {

	public static void main(String[] args) {
		
		String str="hello";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
			
	}
}
