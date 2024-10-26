package exceptionHandling.throwAndThrows;

import java.io.FileNotFoundException;
//import java.io.FileReader;

public class App 
{
	public static void main(String[] args)
	{
		try {
			someMethod();
		} catch (FileNotFoundException e) 
		{
			System.out.println("catch block of main method");	
		} catch (Exception e) 
		{
			System.out.println("catch block of main method (Exception)");
		}
	}
	//public static void someMethod() throws FileNotFoundException
	public static void someMethod() throws Exception 	//No issue
	{
		//FileReader in = new FileReader("file.text");
		System.out.println("Messgae from someMethod");
		//throw new FileNotFoundException();	//throw keyword is used if we want to throw an exception explicitly
		throw new Exception();	//C.E. Parent class exception can't be handled by child class(FileNotFoundException) exception.
	}

}
