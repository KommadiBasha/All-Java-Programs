package com.number.programs;

import java.util.Scanner;

public class ReverseNumberf {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number...");
		int num=sc.nextInt();
		int store=0;
		while(num>0)
		{
			int last=num%10;
			store=last;
			System.out.print(store);
			num/=10;
		}
		;
	}

}
