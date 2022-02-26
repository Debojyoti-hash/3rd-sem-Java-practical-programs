//Program 2

import java.util.Scanner;
class program2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,fact=1;
		System.out.print("Enter the integer number : ");
		num = sc.nextInt();
		for(int i=num; i>=1; i--)
		{
			fact = fact * i;
		}
		System.out.print("The factorial of "+num+" is : "+fact);
	}
}