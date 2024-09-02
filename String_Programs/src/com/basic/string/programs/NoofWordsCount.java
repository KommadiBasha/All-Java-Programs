package com.basic.string.programs;

import java.util.Scanner;

public class NoofWordsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String...");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != ' ' || (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ')) {
				count++;
			}
		}
		System.out.print(count);
	}

}
