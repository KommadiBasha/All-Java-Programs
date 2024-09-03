package com.basic.string.programs;

import java.util.Scanner;

public class DuplicateCharsInString_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		char[] arrChar = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (arrChar[i] == arrChar[j] && arrChar[i] != ' ') {
					count++;
					arrChar[j] = '0';
				}
			}
			if (count > 1 && arrChar[i] != '0') {
				System.out.println(arrChar[i]);
			}
		}
	}

}
