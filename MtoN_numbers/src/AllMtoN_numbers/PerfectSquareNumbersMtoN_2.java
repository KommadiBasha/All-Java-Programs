package AllMtoN_numbers;

import java.util.Scanner;

public class PerfectSquareNumbersMtoN_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		System.out.println("printing 1 to 50 perfect squares");
		for(int i=startNumber;i<=endNumber;i++)
		{
			int temp=i;
			int num=1;
			while(num<=i)
			{
				int square=num*num;
				num++;
				if(temp==square)
				{
					System.out.print(temp+" ");
				}
			}
		}
	}
}
//enter start number...
//1
//enter end number...
//50
//1 4 9 16 25 36 49 