package com.number.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number = sc.nextInt();
		int org = number;
		int store = 0;
		boolean b = false;
		while (number > 0) {
			int last = number % 10;
			store = (store * 10) + last;
			number = number / 10;
		}
		if (org == store) {
			b = true;
		}
		if (b)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
