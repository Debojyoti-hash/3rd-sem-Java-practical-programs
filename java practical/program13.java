class Room
{
	int length;
	Room(int x)
	{
		length = x;
	}
}
class Area extends Room
{
	int breadth;
	Area(int x, int y)
	{
		super(x);
		breadth = y;
	}
	int area()
	{
		return (length*breadth);
	}
}
class Volume extends Area
{
	int height;
	Volume(int x, int y, int z)
	{
		super(x,y);
		height = z;
	}
	int volume()
	{
		return (length*breadth*height);
	}
}

class program13
{
	public static void main(String args[])
	{
		Volume v = new Volume(2,5,7);
		int a = v.area();
		int V = v.volume();

		System.out.println("area = "+a);
		System.out.println("volume = "+V);
	}
}