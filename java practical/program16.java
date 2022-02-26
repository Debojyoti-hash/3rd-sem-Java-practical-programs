import java.io.*;
import java.util.Scanner;

class program16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x,y,z,a;
		System.out.println("Enter two integer numbers : ");
		a = sc.nextInt();
		x = sc.nextInt();
		try
		{
			z = x/a;
			System.out.println("z = "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		y = x + a;
		System.out.println("y = "+y);
	}
}