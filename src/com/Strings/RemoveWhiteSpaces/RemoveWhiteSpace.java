package com.Strings.RemoveWhiteSpaces;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		//Java Program to remove all the white space of the String
		String str =" j  a  va   s  ta   r      ";
		
		String str1=str.replaceAll("\\s", "");
		
		System.out.println(str1);
	}
}