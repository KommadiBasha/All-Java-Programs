package com.number.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number = sc.nextInt();
		int numberCopy=number;
		int originalNumber=number;
		int count=0;
		int sum=0;
		while(number>0)
		{
			count++;
			number/=10;
		}
		while(numberCopy>0)
		{
			int last=numberCopy%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*last;
				
			}
			sum+=fact;
			numberCopy/=10;
		}
		if(sum==originalNumber)
			System.out.println("Armstrong number...");
		else
			System.out.println("Not a armstrong number...");
	}

}
