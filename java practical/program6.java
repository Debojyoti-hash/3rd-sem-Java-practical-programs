import java.util.Scanner;
class program6
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("How many numbers you want to add : ");
		int n = sc.nextInt();
		
		System.out.print("Enter "+n+" numbers in the list :");
		for(int i=0; i<n; i++)
		{	
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the number you want to search in the list : ");
		int num = sc.nextInt();
		
		for(int j=0; j<n; j++)
		{
			if(arr[j]==num)
			{	
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The number "+num+" is there in the list.");
		}
		else
		{
			System.out.println("The number "+num+" is not present in the list.");
		}
	}
}
