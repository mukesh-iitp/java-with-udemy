package fileHandling;

import java.io.FileInputStream;

public class InputStream 
{
	void meth1()
	{
		try
		{
			FileInputStream fin=new FileInputStream("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file.txt");
			int i=0;
			while((i=fin.read())!=-1)
				{
					System.out.print((char)i);
				}
			fin.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		InputStream obj=new InputStream();
		obj.meth1();
		
	}

}
