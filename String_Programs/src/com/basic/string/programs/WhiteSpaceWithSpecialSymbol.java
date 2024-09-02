package com.basic.string.programs;

import java.util.Scanner;

public class WhiteSpaceWithSpecialSymbol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you String...");
		String str=sc.nextLine();
		String specialChar="@";
		String store="";
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				store=store+str.charAt(i);
			}
			else
			{
				store=store+specialChar;
			}
		}
		System.out.print(store);
	}

}
