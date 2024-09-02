package com.basic.string.programs;

import java.util.Scanner;

public class ConvertUpper_Lower_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		
		String store="";
		for(int i=0;i<str.length();i++)
		{
			char c1=str.charAt(i);
			if(c1==' ')
			{
				store=store+' ';
			}
			else if(c1>='a' && c1<='z')
			{
				store=store+str.charAt(i);
			}
			else
			{
				char c2=(char)(c1+32);
				store+=c2;
			}
		}
		System.out.println(store);
	}

}
