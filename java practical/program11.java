class student
{
	String name;
	int roll;
	static String cllgname;
	static int counter = 0;

	public student(String name)
	{
		this.name = name;
		this.roll = setRoll();
	}
	
	static int setRoll()
	{
		counter++;
		return counter;
	}
	
	static void setcllg(String name)
	{
		cllgname = name;
	}

	void getStudentInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Roll : "+this.roll);
		System.out.println("College name : "+cllgname);
	}
}

class program11
{
	public static void main(String args[])
	{
		student.setcllg("XYZ");
		student s1 = new student("Ram");
		student s2 = new student("Shyam");
		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}