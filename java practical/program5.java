//Program 5

import java.util.Scanner;
class program5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,flag=0;
		System.out.print("Enter the number you want to check : ");
		num = sc.nextInt();
		for(int i=2; i<=num/2; i++)
		{
			if(num % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(num+" is not a prime number.");
		}
		else if(num==1)
		{
			System.out.println(num+" is neither prime nor composite.");
		}
		else
		{
			System.out.println(num+" is a prime number.");
		}
	}
}