package com.number.programs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ...");
		int number1 = sc.nextInt();
		int square=number1*number1;
		int store=square;
		int sum=0;
		while(square>0)
		{
			int last=square%10;
			sum+=last;
			square/=10;
		}
		System.out.println(sum);
		if(number1==sum)
			System.out.println("neon number...");
		else
			System.out.println("not a neon number");
	}

}
