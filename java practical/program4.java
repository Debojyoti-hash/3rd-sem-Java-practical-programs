// Program 4

import java.util.Scanner;
class program4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[30];
		int num,n,i=0;
		System.out.print("Enter the decimal number : ");
		num = sc.nextInt();
		n = num;
		while(n!=0)
		{
			arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.print("The binary of "+num+" is : ");
		for(int j=i-1; j>=0; j--)
		{
			System.out.print(arr[j]);
		}
	}
}