package com.basic.string.programs;

import java.util.Scanner;

public class ReverseStringWithOutChangingIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		String store="";
		for(int i=0;i<str.length();i++)
		{
			int j=i;
			while(i<str.length() && str.charAt(i)!=' ')
			{
				i++;
			}
			for(int k=i-1; k>=j; k--)
			{
				store+=str.charAt(k);
			}
			store+=' ';		}
		System.out.println(store);
	}

}
