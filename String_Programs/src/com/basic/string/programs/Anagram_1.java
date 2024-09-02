package com.basic.string.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();
		
		char [] c1=str1.toCharArray();
		char [] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		 str1= new 	String(c1);
		 str2= new 	String(c2);
		 
		
		if(str1.equals(str2))
		{
			System.out.println("Anagram...");
		}
		else
		{
			System.out.println("Not a anagram");
		}
	}

}
