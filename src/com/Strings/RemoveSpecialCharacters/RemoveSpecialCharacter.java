package com.Strings.RemoveSpecialCharacters;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
	
	String str="$ja!va$&st%ar";
	
	//Approach-1 : Using replaceAll()
	
	String plainString=str.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(plainString);
	}
}
