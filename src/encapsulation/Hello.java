package encapsulation;

public class Hello {

	public static void main(String[] args)
	{
		//Person john=new Person();
		//System.out.println(john);
		//System.out.println("\n----------------------------\n");
		//john.age=-10;
		//System.out.println(john);
		
		System.out.println("\n----------------------------\n");
		Person pooja=new Person("Pooja", 18, "Female");
		System.out.println(pooja);
		System.out.println(pooja.setAge(-30));
		System.out.println(pooja);
		

	}

}
