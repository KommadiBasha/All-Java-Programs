package com.basic.string.programs;

import java.util.Scanner;

public class TotalCountVowels_Conconats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		str.toLowerCase();
		int countVowels=0;
		int countConconates=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||
			   str.charAt(i)=='o' ||str.charAt(i)=='u' && str.charAt(i)!=' ')
			{
				countVowels++;
			}
			else if(str.charAt(i)!=' ')
			{
				countConconates++;
			}
				
		}
		System.out.println("vowels count  : "+countVowels);
		System.out.println("conconates counbt "+countConconates);
	}

}
