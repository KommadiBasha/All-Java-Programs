package com.basic.string.programs;

import java.util.Scanner;

public class FrequentlyRepeatedcharInString {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a string...");
			String str = sc.nextLine();
			int count=0;
			int countMore=0;
			char [] arrStr=str.toCharArray();
			for(int i=0;i<str.length();i++)
			{
				count=1;
				for(int j=i+1;j<str.length();j++)
				{
					if(arrStr[i]==arrStr[j] && arrStr[i]!=' ')
					{
						count++;
						countMore++;
						arrStr[j]='0';
					}
				}
				if(count >1 && arrStr[i]!='0')
				{
					if(count<countMore)
					System.out.println(str.charAt(i));
				}
			}
	}

}
