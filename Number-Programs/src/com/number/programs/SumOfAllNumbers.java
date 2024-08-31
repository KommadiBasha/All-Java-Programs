package com.number.programs;

import java.util.Scanner;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numbers...");
		int num = sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			sum+=last;
			num/=10;
		}
		System.out.println(sum);
	}

}
