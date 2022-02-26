class Distance
{
	double x1,y1,x2,y2;
	Distance(double a,double b,double c,double d)
	{
		x2 = a;
		x1 = b;
		y2 = c;
		y1 = d;
	}
	void calculate()
	{
		double d = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		System.out.println("The distance between both the coordinates is : "+d);
	}
	
}

public class program9
{
	public static void main(String[] args) 
	{	
		Distance d1 = new Distance(9.4,5.9,4.2,2.6);
		d1.calculate();
	}
}
