package AllMtoN_numbers;

import java.util.Scanner;

public class OddNumbersMtoN_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter start number...");
		int startNumber=sc.nextInt();
		System.out.println("enter end number...");
		int endNumber=sc.nextInt();
		
		for(int i=startNumber;i<=endNumber;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
