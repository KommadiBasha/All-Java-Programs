package com.basic.string.programs;

import java.util.Scanner;

public class ReplacingWhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string...");
		String st=sc.nextLine();
		String store="";
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				store+="*";
			}
			else
			{
				store+=st.charAt(i);
			}
		}
		System.out.println(store);
	}

}
