package AllMtoN_numbers;

import java.util.Scanner;

public class NeonNumbersMtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int num=x;
			int fact=num*num;
			int sum=0;
			int last=0;
			while(fact>0)
			{
			last=fact%10;
			sum+=last;
			fact/=10;
			}
			//System.out.print(last+" ");
			if(sum==x)
			{
				System.out.print(x+" ");
			}
		}
	}
}
