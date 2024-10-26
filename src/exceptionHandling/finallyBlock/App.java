package exceptionHandling.finallyBlock;

public class App 
{

	public static void main(String[] args) 
	{
		int x = 2;
		try
		{
			System.out.println("We don't know the output "+x/0);
		}
		catch (RuntimeException e) 	//catch block must be placed before finally block
		{
			System.out.println("Runtime exception");
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		finally	//with the use of finally, catch block become optional. Finally block will be executed whether exception occurs or not.
		{
			System.out.println("This will get printed");
			System.out.println();
		}
		
	}
	

}
