package com.number.programs;

import java.util.Scanner;

public class FactorNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		boolean b=false;
		int number= sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				b=true;
				System.out.print(i+" ");
			}
		}
		if(b)
		{
		System.out.println("This Number are factors of "+number);	
		}
	}

}
