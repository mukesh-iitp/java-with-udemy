package collections.compareInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//class Names implements Comparable<Names>
class Names
{
	private String name;

	public Names(String name) 
	{
		this.name = name;
	}
	/*
	@Override
	public int compareTo(Names obj)
	{
		if(name.length() == obj.name.length())
			return 0;
		else if(name.length() < obj.name.length())
			return 1;
		else
			return -1;
	}
	*/
	@Override
	public String toString() 
	{
		//return "Names [name=" + name + "]";
		return name;
	}
}


public class ClassA 
{
	public static void main(String[] args) 
	{
		/*
		List<String> countries=new LinkedList<>();	//recommended
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		ClassA obj=new ClassA();
		obj.printList(countries);
		
		Collections.sort(countries);
		obj.printList(countries);
		*/

		//List<Names> names=new LinkedList<>();
		List<Object> elements=new LinkedList<>();	//Object for creating a List of any type
		elements.add(new Names("Chaand"));
		elements.add(new Names("Ed"));
		elements.add(new Names("Jhon"));
		elements.add(new Names("Mia"));
		elements.add(new Names("Some String"));
		elements.add(1);
		elements.add(2.0);
		elements.add('@');
		
		ClassA obj=new ClassA();
		obj.printList(elements);
		
		//Collections.sort(elements);
		//obj.printList(elements);
		
	}
	void printList(List<Object> list)
	{
		int i=0;
		ListIterator<Object> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println("Element"+(i++)+": "+itr.next());
		}
		System.out.println("-----------");
	}

}
