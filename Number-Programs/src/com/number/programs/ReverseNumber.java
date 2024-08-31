package com.number.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number...");
		int num = sc.nextInt();
		int store=0;
		while(num>0)
		{
			int last=num%10;
			store=(store*10)+last;
			num/=10;
			
		}
		System.out.println(store);
	}

}
