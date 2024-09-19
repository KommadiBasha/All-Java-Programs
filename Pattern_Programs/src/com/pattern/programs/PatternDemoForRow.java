package com.pattern.programs;

import java.util.Scanner;

public class PatternDemoForRow {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter row");
		int row =sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			System.out.println("*");
		}
		
	}
}
