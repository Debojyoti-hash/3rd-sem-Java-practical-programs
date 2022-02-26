import java.util.Scanner;
class program3
{
	public static void main(String args[])
	{
		int num,decimal=0,binary,base=1,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		binary = sc.nextInt();
		num = binary;
		
		while(num>0)
		{
			rem = num % 10;
			num = num / 10;
			decimal = decimal + (rem*base);
			base = base*2;
		}
		
		System.out.println("The decimal form of "+binary+" is "+decimal);		
	}
	
}