package fileHandling;

import java.io.FileOutputStream;

public class OutputStream 
{
	void meth1()
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("C://Users/Mukesh/eclipse-workspace/corejava/src/com/filehandling/file.txt");
			String s="Java is awesome!";
			//fout.write(65);
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("File write successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		OutputStream obj=new OutputStream();
		obj.meth1();
		
	}

}
