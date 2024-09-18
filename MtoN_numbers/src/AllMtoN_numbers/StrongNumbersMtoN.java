package AllMtoN_numbers;

import java.util.Scanner;

public class StrongNumbersMtoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int sum=0;
				for(int i=x;i!=0;)
				{
					int last=i%10;
					int fact=1;
					for(int j=1;j<=last;j++)
					{
						fact*=j;
					}
					sum+=fact;
					i/=10;
				}
		
				if(sum==x)
				{
					System.out.print(sum+" ");
				}
			}	
	}

}
