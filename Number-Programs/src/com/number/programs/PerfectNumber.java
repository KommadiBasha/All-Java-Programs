package com.number.programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number...");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{ 
			if(num%i==0)
			{
				sum+=i;
			}
			
		}
		if(sum==num)
		System.out.println("p");
		else
			System.out.println("np");

	}

}
