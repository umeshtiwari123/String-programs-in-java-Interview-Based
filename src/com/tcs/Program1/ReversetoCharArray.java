package com.tcs.Program1;

public class ReversetoCharArray {

	public static void main(String[] args) {

		String s1 = "hello";

		char[] chArr = s1.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {

			System.out.print(chArr[i]);
		}

	}
}
