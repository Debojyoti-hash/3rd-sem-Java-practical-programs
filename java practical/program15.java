interface printing
{
	void print();
}

class program15 implements printing
{
	public void print()
	{
		System.out.println("Implementation of an interface.");
	}
	public static void main(String args[])
	{
		program15 obj = new program15();
		obj.print();	
	}
}