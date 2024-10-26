package generics;

class Generic<K extends Integer,V extends BoundedParameter >
{
	private K key;
	private V value;
	public Generic(K key, V value) 
	{
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() 
	{
		return "Generic [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends Character,N extends Number> void display(E element, N number)
	{
		System.out.println("Element: "+element+" Number: "+number);
	}
}

public class BoundedParameter 
{
	public static void main(String[] args) 
	{
		//Generic<Integer,String> data=new Generic<Integer,String> (1, "value");
		//data.display('$', 1);
		//data.display("element", 1.2);
		//data.display("element", 2.0f);
		Generic<Integer,BoundedParameter> data=new Generic<Integer,BoundedParameter> (1, new BoundedParameter());
		data.display('$', 1);
		data.getValue().test();
		System.out.println(data.getKey());
	}
	public void test()
	{
		System.out.println("Testing.....");
	}
}
