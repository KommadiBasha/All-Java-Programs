package AllMtoN_numbers;

import java.util.Scanner;

public class OddNumbersMtoN_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter start number...");
		int startNumber=sc.nextInt();
		System.out.println("enter end number...");
		int endNumber=sc.nextInt();
		while(startNumber<endNumber)
		{
			if(startNumber%2==1)
			{
				System.out.print(startNumber+" ");
			}
			startNumber++;
		}

	}

}
