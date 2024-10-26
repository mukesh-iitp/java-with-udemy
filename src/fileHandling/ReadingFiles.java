package fileHandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class ReadingFiles 
{
	void meth1()
	{
		try 
		{
			FileInputStream fin1=new FileInputStream("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file1.txt");
			FileInputStream fin2=new FileInputStream("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file2.txt");
			SequenceInputStream s=new SequenceInputStream(fin1,fin2);
			int i=0;
			while((i=s.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin1.close();
			fin2.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		ReadingFiles obj=new ReadingFiles();
		obj.meth1();
	}
}
