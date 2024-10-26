package collections.arraylist;

import java.util.ArrayList;

public class App 
{
	static ArrayList<String> listNames=new ArrayList<>();
	
	public static void main(String[] args) 
	{
		listNames.add("Chaand");
		listNames.add("John");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		//System.out.println(listNames);
		App app=new App();
		app.displayList(listNames);
		/*
		app.removeNameByPosition(0);
		System.out.println("---------------------");
		app.displayList(listNames);
		System.out.println("---------------------");
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));
		*/

		/*
		System.out.println("---------------------");
		app.removeNameByString("Pooja");
		app.displayList(listNames);
		System.out.println("---------------------");
		System.out.println(listNames.get(3));
		System.out.println(listNames.get(4));
		*/
		
		System.out.println("---------------------");
		int position=app.search("Pooja");
		//System.out.println(position);
		if(position!=-1)
			app.modifyName(position, "Emma");
		else
			System.out.println("Inavalid entry");
		app.displayList(listNames);
		
	}
	void displayList(ArrayList<String> names)
	{
		for(String name:names)
			System.out.println(name);
	}
	void removeNameByPosition(int position)
	{
		listNames.remove(position);
	}
	void removeNameByString(String name)
	{
		listNames.remove(name);
	}
	void modifyName(int position, String newName)
	{
		listNames.set(position, newName);
	}
	int search(String name)
	{
		return listNames.indexOf(name);
	}

}
