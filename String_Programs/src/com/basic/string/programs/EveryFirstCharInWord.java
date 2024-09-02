package com.basic.string.programs;

import java.util.Scanner;

public class EveryFirstCharInWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string...");
		String str = sc.nextLine();
		String firstChar="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && str.charAt(i)!=' ' || (str.charAt(i)!=' ' && str.charAt(i-1)==' '))		
			{
				firstChar+=str.charAt(i);
			}
		}
		System.out.println(firstChar);

	}

}
