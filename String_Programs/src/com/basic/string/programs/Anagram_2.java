package com.basic.string.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string ");
		String str2 = sc.nextLine();

		str1.toLowerCase();
		str2.toLowerCase();
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2))
			System.out.println("Anagram");
		else
			System.out.println("not a anagarm");

	}

}
