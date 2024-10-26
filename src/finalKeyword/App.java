package finalKeyword;

public class App 
{
	public static void main(String[] args) 
	{
		B obj1=new B();
		System.out.println(obj1.getX());
		//obj1.setX(10);
		//System.out.println(obj1.getX());
		
		obj1.india();
		//obj1.usa();	//A Class made final, it cannot have a subclass
	}

}
