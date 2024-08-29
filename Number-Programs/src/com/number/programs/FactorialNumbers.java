package com.number.programs;

public class FactorialNumbers {

	public static void main(String[] args) {
		int fact=1;
		int num=4;
		while(num>0)
		{
			fact=fact*num;
			--num;
		}
		System.out.println(fact);
	}

}
