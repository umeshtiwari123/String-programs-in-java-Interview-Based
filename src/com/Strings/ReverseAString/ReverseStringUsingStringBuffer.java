package com.Strings.ReverseAString;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		
		String str="hello";
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
	}
}
