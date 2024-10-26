package collections.iterators;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ClassA 
{
	public static void main(String[] args) 
	{
		List<String> countries=new LinkedList<>();	//recommended
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		ClassA obj=new ClassA();
		obj.printList(countries);
		//countries.sort(null);	//sort as per natural ordering i.e ascending
		//obj.printList(countries);
		Collections.reverse(countries);
		obj.printList(countries);
		
	}
	void printList(List<String> list)
	{
		int i=0;
		//Iterator<String> itr=list.iterator();
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println("Element"+(i++)+": "+itr.next());
		}
		System.out.println("-----------");
	}
}
