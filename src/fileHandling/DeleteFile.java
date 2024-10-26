package fileHandling;

import java.io.File;

public class DeleteFile 
{
	void meth1()
	{
		File file=new File("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file3.txt");
		if(file.delete())
		{
			System.out.println("File delete successfully.");
		}
		else
		{
			System.out.println("File does not exist");
		}
		
	}
	public static void main(String[] args) 
	{
		DeleteFile obj=new DeleteFile();
		obj.meth1();
	}
}
