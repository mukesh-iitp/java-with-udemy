package fileHandling;

import java.io.File;

public class CreateFile 
{
	void meth1()
	{
		try
		{
			//File f=new File("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file.txt");
			//File f=new File("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file1.txt");
			File f=new File("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file2.txt");
			if(f.createNewFile())
			{
				System.out.println("File Created = "+f.getName());
			}
			else
			{
				System.out.println("File already exist");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		CreateFile obj=new CreateFile();
		obj.meth1();
		
	}

}
