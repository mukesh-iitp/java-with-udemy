package generics;

class Data
{
	private Object obj;

	public Data(Object obj) 
	{
		this.obj = obj;
	}

	public Object getObj() 
	{
		return obj;
	}

	@Override
	public String toString() 
	{
		return "Data [obj=" + obj + "]";
	}	
}

class GenericClass<T>
{
	private T data;	//T sysmbolizes type of any type

	public GenericClass(T data) 
	{
		this.data = data;
	}

	public T getData() 
	{
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
}



public class ClassA 
{
	public static void main(String[] args) 
	{
		/*
		Data data=new Data("Some String");
		String variable=(String)data.getObj();
		System.out.println(variable);
		*/
		
		/*
		GenericClass genericData=new GenericClass("Some data");
		String data=(String)genericData.getData();	//type casting requires some processing.
		System.out.println(data);
		*/
		
		//Generic Use
		GenericClass<String> genericData=new GenericClass<String>("Some data"); //specifying the type of the variable and data passing to constructor
		String data=genericData.getData();
		System.out.println(data);
		
	}

}
