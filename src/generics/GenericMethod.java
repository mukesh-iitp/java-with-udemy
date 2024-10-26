package generics;

import java.util.ArrayList;
import java.util.List;

class DataOfGenerics	//Generic Class
{
	public <E> void printListData(List<E> list)
	{
		for(E element:list)
			System.out.println(element);
	}
	public <E> void printArrayData(E[] arrayData)
	{
		for(E element: arrayData)
			System.out.println(element);
	}
}

public class GenericMethod 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		DataOfGenerics data=new DataOfGenerics();
		System.out.println("Printing integer list");
		data.printListData(list);
		
		List<String> list2=new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		System.out.println("\nPrinting String list");
		data.printListData(list2);
		
		String[] stringArray= {"One","Two","Three"};
		System.out.println("\nPrinting String Array");
		data.printArrayData(stringArray);
		
		Integer[] integerArray= {1,2,3};
		System.out.println("\nPrinting Integer Array");
		data.printArrayData(integerArray);
		
		Double[] doubleArray={1.0,2.0,3.0,4.0,5.0};
		System.out.println("\nPrinting Double Array");
		data.printArrayData(doubleArray);
	}
	
	

}
