package AllMtoN_numbers;

import java.util.Scanner;

public class DivisibleBy3and7MtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			if(x%3==0 && x%7==0)
			{
				System.out.print(x+" ");
			}
		}
	}
}
