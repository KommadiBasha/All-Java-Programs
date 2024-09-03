package com.basic.string.programs;

import java.util.Scanner;

public class RemoveAllVowels_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		String strVowels = "aeiouAEIOU";
		String store="";
		for (int i = 0; i < str.length(); i++) {
			boolean b = true;
			for (int j = 0; j < strVowels.length(); j++) {
				if (str.charAt(i) == strVowels.charAt(j)) {
					b=false;
					break;
				}
			}
			if(b)
			{
				store+=str.charAt(i);
			}
		}
		System.out.println(store);
	}

}
