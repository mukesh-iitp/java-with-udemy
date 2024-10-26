package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
class Names
{
	private String name;
	
	public Names(String name)
	{
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
*/

class Datas<T>
{
	private T myVariable;

	public Datas(T myVariable) 
	{
		this.myVariable = myVariable;
	}

	public T getMyVariable() 
	{
		return myVariable;
	}

	@Override
	public String toString() 
	{
		return "Datas [myVariable=" + myVariable + "]";
	}
	
}

public class ClassB 
{
	public static void main(String[] args)
	{
		/*
		List<Object> elements=new LinkedList<>();
		elements.add(new Names("Chaand"));
		elements.add(new Names("ED"));
		elements.add(new Names("John"));
		elements.add(new Names("Mia"));
		elements.add(new Names("Some String"));
		elements.add(1);
		elements.add(2.0);
		elements.add('@');
		*/
		
		List<Datas<Object>> elements=new LinkedList<>();
		elements.add(new Datas<Object>("Some Text"));
		elements.add(new Datas<Object>(1.0));
		elements.add(new Datas<Object>(1));
		elements.add(new Datas<Object>('%'));
		elements.add(new Datas<Object>(5.0f));
		
		ClassB bobj=new ClassB();
		bobj.printList(elements);
	}
	void printList(List<Datas<Object>> list)
	{
		ListIterator<Datas<Object>> iterator=list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println("Element: "+iterator.next().getMyVariable());
		}
	}
	
}
