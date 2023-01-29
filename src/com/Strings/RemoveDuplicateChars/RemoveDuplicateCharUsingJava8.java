package com.Strings.RemoveDuplicateChars;

public class RemoveDuplicateCharUsingJava8 {

	public static void main(String[] args) {
		
		//input - programming
		//output - poraming
		
		String str="programming";
		
		//Approach - 1 -- Using Java 8 feature
		
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c->sb1.append((char)c));
		
		System.out.println(sb1);
		}
}
