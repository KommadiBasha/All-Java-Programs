package com.basic.string.programs;

import java.util.Scanner;

public class Palindrome_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int length = str.length();
		boolean b = true;
		for (int i = 0; i < length / 2; i++) {

			if (str.charAt(i) != str.charAt(length - i - 1)) {
				b = false;
				break;
			}
		}
		if (b)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}

}
