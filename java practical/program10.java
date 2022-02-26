class A
{
	int x,y;
	float compute_area(int x,int y)
	{
		return(x*y);
	}
	float compute_area(int x)
	{
		return(x*x);
	}
}
class program10
{
	public static void main(String args[])
	{
		A a = new A();
		float a1 = a.compute_area(4,9);
		System.out.println("The area of rectangle is : "+a1);
		float a2 = a.compute_area(5);
		System.out.println("The area of square is : "+a2);
	}
}