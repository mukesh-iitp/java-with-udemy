package collections.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassA 
{
	public static void main(String[] args) 
	{
		//LinkedList<String> countries=new LinkedList<>();
		List<String> countries=new LinkedList<>();	//recommended
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		ClassA obj=new ClassA();
		obj.printList(countries);
		
		//ArrayList<String> demo=new ArrayList<>();
		List<String> demo=new ArrayList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		
		obj.printList(demo);
		
	}
	void printList(List<String> list)
	{
		int i=0;
		for(String element:list)
			System.out.println("Element"+(i++)+": "+element);
		System.out.println("------------------");
	}


}
