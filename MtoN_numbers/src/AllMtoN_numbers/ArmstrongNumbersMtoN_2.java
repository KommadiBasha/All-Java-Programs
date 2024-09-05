package AllMtoN_numbers;

import java.util.Scanner;

public class ArmstrongNumbersMtoN_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int num1=x;
			int num2=x;
			int sum=0;
			int count=0;
			while(num1>0)
			{
				count++;
				num1/=10;
			}
				while(num2>0)
				{
					int fact=1;
					int last =num2%10;
					for(int i=1;i<=count;i++)
					{
						fact*=last;
					}
					num2/=10;
					sum+=fact;
					
					
				}
				System.out.print(count);
//			if(x==sum)
//			{
//				System.out.print(x+" ");
//			}
//			
		}
	}
			
}
