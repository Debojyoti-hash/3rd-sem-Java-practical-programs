import java.io.*;
import java.util.*;
class program19
{
	public static void main(String args[])throws Exception
	{
		int char_count = 0, word_count = 0, line_count = 0; 
		String s,fname;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the name of the file to display : ");
		fname = stdin.nextLine();
		StringTokenizer st;
		try
		{
			BufferedReader f = new BufferedReader(new FileReader(fname));
			while((s = f.readLine())!=null)
			{
				line_count++;
				st = new StringTokenizer(s,",:.;");
				while(st.hasMoreTokens())
				{
					word_count++;
					s = st.nextToken();
					char_count += s.length();
				}
			}
		
			System.out.println("Characters : "+char_count);
			System.out.println("Words : "+word_count);
			System.out.println("Lines : "+line_count);
			f.close();
		}
		catch(Exception e)
		{
			System.out.println("Source file not found.");
		}
	}	
}