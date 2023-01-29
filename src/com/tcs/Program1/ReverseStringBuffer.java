package com.tcs.Program1;

public class ReverseStringBuffer {

	public static void main(String[] args) {

		String str="hello";
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
	}

}
