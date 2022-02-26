class program7
{
	public static void main(String args[])
	{
		int swap=0;
		
		int arr[] = new int[]{12,43,33,78,28};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		System.out.print("The ascending order of the list is : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}	
		
		System.out.println(" ");		

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]>arr[i])
				{
					swap = arr[j];
					arr[j] = arr[i];
					arr[i] = swap;
				}	
			}
		}
		System.out.print("The descending order of the list is : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}