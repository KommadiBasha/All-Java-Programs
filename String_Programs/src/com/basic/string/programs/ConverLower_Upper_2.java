package com.basic.string.programs;

import java.util.Scanner;

public class ConverLower_Upper_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		String store="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			
			if(c==' ' )
			{
				store=store+' ';
			}
			else if(c>='A' && c<='Z')
			{
				store=store+str1.charAt(i);
			}
			else
			{
				char cr=(char)(c-32);
				store=store+cr;
			}
		}
		System.out.println(store);
	}

}
