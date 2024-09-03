package com.basic.string.programs;

import java.util.Scanner;

public class AllVowelsInString_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		String allVowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++)
		{
			boolean b=false;
			for(int j=0;j<allVowels.length();j++)
			{
				if(str.charAt(i)==allVowels.charAt(j))
				{
					b=true;
				}
			}
			if(b)
			{
				System.out.print(str.charAt(i));
			}
		}
	}

}
