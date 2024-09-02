package com.basic.string.programs;

import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String original = str;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				reverse += str.charAt(i);
			}
		}
		if (original.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
