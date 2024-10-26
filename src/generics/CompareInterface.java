package generics;

class Generics<T extends Comparable<T>> implements Comparable<T>
{
	private T myVariable;
	
	public Generics(T myVariable)
	{
		this.myVariable=myVariable;
	}
	public T getMyVariable()
	{
		return myVariable;
	}
	@Override
	public String toString()
	{
		return "Data [myVariable" +myVariable+ "]";
	}
	@Override
	public int compareTo(T o) 
	{
		return getMyVariable().compareTo(o);
		//return o.compareTo(myVariable);
	}
	
}

public class CompareInterface 
{
	public static void main(String[] args) 
	{
		Generics<Integer> data=new Generics<Integer>(1); //part1
		System.out.println(data.compareTo(0));	//part2
		
	}

}
