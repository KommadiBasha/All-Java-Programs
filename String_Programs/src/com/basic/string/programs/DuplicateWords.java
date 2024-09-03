package com.basic.string.programs;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int count;
		String[] arrStr = str.split(" ");
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < arrStr.length; j++) {
				if (arrStr[i].equals(arrStr[j])) {
					count++;
					arrStr[j]="0";
				}
			}
		if (count >1 && arrStr[i]!="0") {
			System.out.println(arrStr[i]);
		}
		}
	}
}
