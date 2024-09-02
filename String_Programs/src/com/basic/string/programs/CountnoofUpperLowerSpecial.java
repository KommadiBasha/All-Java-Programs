package com.basic.string.programs;

import java.util.Arrays;
import java.util.Scanner;

public class CountnoofUpperLowerSpecial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		
		int countForupper=0;
		int countForLower=0;
		int countSpecial=0;
		
		char [] c=str.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				countForLower++;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				countForupper++;
			}
			else
			{
				countSpecial++;
			}
		}
		System.out.println("count of upper case : "+countForupper);
		System.out.println("count of lower case : "+countForLower);
		System.out.println("count of special case : "+countSpecial);
	}

}
