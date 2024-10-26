package exceptionHandling.multipleCatch;

public class App 
{
	public static void main(String[] args) 
	{
		int x = 0;
		//int y = 5;
		try
		{
			//System.out.println("The statement will get executed");
			//x=(y=10*10)/0;
			System.out.println("We don't know the output "+x/0);
			//System.out.println("The statement will not get executed");
		}catch (ArithmeticException e) // java will try to select accurate type of exception
		{
			System.out.println("Arithmatic exception occured");
		}
		catch (Exception e) 	//parent exception catch block must come after child exception catch block
		{
			e.printStackTrace();
			System.out.println("Inside exception block.");
		}
			//System.out.println("*****************");
			//System.out.println(y);
		
		
	}

}
