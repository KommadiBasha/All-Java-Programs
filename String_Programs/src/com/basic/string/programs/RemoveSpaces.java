package com.basic.string.programs;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String store="";
		for(int i=0;i<str.length();i++)
		{
			if( str.charAt(i)!=' ')
			{
				store=store+str.charAt(i);
			}
		}
		System.out.print(store);
		}

}
