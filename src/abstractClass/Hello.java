package abstractClass;

import abstractClass.person.Vegan;
import abstractClass.person.NonVegan;
import abstractClass.person.Person;


public class Hello {

	public static void main(String[] args) 
	{
		Person john=new Vegan();
		john.speak();
		john.eat();
		System.out.println("*************");
		Person mia=new NonVegan();
		mia.speak();
		mia.eat();
	}

}
