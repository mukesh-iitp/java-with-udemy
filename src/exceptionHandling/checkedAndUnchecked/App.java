package exceptionHandling.checkedAndUnchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App 
{
	public static void main(String[] args) 
	{
		
		//unchecked exception example
		
		int x = 10 , y;
		
		y=x/0;	//Arithmetic exception 
		
		System.out.println(y);
		
		//checked exception example , checked by exception
		
		try {
			FileReader in = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
