class program12
{
	public static void main(String args[])
	{
		System.out.println("Boxing : ");
		int a = 50;
		Integer a2 = new Integer(a);
		System.out.println(a2);

		System.out.println("Unboxing : ");
		Integer i = new Integer(40);
		int b = i;
		System.out.println(b);
	}
}