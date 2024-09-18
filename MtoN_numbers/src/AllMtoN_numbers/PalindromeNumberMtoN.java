package AllMtoN_numbers;

import java.util.Scanner;

public class PalindromeNumberMtoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int num1=x;
			int sum=0;
			while(num1>0)
			{
				int last=num1%10;
				sum=sum*10+last;
				num1/=10;
			}
			if(sum==x)
			{
				System.out.print(x+" ");
			}
		}
	}
}
