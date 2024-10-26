package generics;

/*
 * 
 The naming convention are as follows:
 T - Type
 E - Element
 K - Key
 N - Number
 V - Value
 * 
 */

class DataClass<K,V>	//Generic Class
{
	private K key;
	private V value;
	public DataClass(K key, V value) 
	{
		this.key = key;
		this.value = value;
	}
	public K getKey()
	{
		return key;
	}
	public V getValue()
	{
		return value;
	}
	@Override
	public String toString() {
		return "DataClass [key=" + key + ", value=" + value + "]";
	}
	
	public <E, N> void display(E element, N number)	//generic method
	{
		System.out.println("Element: "+element+ " Number: "+number);
	}
}

public class TypeParameters 
{

	public static void main(String[] args) 
	{
		DataClass<Integer, String> data=new DataClass<Integer, String>(1,"Chand");
		
		System.out.println("Key: "+data.getKey()+", Value: "+data.getValue());
		data.display("element", "number");
		data.display("element", 23);
		data.display("2.0", 23);
	}

}
