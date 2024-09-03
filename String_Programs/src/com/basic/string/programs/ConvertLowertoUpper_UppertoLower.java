package com.basic.string.programs;

import java.util.Scanner;

public class ConvertLowertoUpper_UppertoLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				store += ' ';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				char c1 = (char) (ch - 32);
				store += c1;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				char c2 = (char) (ch + 32);
				store += c2;
			}
		}
		System.out.println(store);
	}

}
