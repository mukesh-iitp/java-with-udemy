package collections.linkedList;

import java.util.LinkedList;

public class ClassA 
{
	public static void main(String[] args) 
	{
		LinkedList<String> countries=new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		//System.out.println(countries);
		ClassA obj=new ClassA();
		obj.printList(countries);
		countries.add(1, "Canada");
		countries.add("Bragile");
		obj.printList(countries);
		countries.set(7, "Brazil");
		obj.printList(countries);
		countries.remove();	//1st element will be removed
		obj.printList(countries);
		countries.remove(3);
		obj.printList(countries);
		
	}
	void printList(LinkedList<String> list)
	{
		int i=0;
		for(String element:list)
			System.out.println("Element"+(i++)+": "+element);
		System.out.println("------------------");
	}
}
