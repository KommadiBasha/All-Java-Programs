package com.basic.string.programs;

import java.util.Scanner;

public class DuplicateCharsInString_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			char ch = str.charAt(i);
			if (ch == ' ') {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
					str = str.substring(0, j) + str.substring(j + 1);
				}
			}
			if (count > 1) {
				System.out.print(str.charAt(i));
			}
		}

	}

}
