package com.Strings.ReverseAString;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		String str="hello";
		
		StringBuilder sb=new StringBuilder(str);
		
		System.out.println(sb.reverse());
	}
}
