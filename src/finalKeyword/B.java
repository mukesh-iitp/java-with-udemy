package finalKeyword;

//public class B extends A	// inheritance is not allowed for final class
public class B
{
	private final int x=1;
	/*
	public B() 
	{	
	}
	*/
	/*public B(int x) 
	{
		this.x = x; 
	}
	*/
	public int getX() 
	{
		return x;
	}
	/*
	public void setX(int x) 
	{
		this.x = x;	//C.E final field can't be assigned.
	}
	*/
	//@Override	// if a method is made final it can't be overridden.
	public void india() 
	{
		System.out.println("Hello India, whats up!");
	}
	
	
}
