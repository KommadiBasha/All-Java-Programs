package com.basic.string.programs;

import java.util.Scanner;

public class ReverseStringp {

	public static void main(String[] args) {
		System.out.println("Enter a string...");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String prt=rev(str);
		System.out.println(prt);
	
	}
	public static String rev(String input)
	{
		char [] c=input.toCharArray();
		int reversingStart=0;
		int totalCount=c.length-1;
		while(reversingStart<totalCount)
		{
			char temp=c[reversingStart];
			c[reversingStart]=c[totalCount];
			c[totalCount]=temp;
			reversingStart++;
			totalCount--;
		}
		return new String(c);
	}
}
