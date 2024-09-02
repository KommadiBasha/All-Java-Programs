package com.basic.string.programs;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		int count=0;
		String store="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && str.charAt(i)!=' ' || (str.charAt(i)!=' ' && str.charAt(i-1)==' '))		
			{
				store+=str.charAt(i);
				count++;
			}	
		}
		if(count==1)
		{
			System.out.println(store);	
		}
		
	}
}
