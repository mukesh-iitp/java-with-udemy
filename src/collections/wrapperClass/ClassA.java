package collections.wrapperClass;

import java.util.ArrayList;

public class ClassA 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> demoListInteger=new ArrayList<>();
		demoListInteger.add(10);	//autoboxing is done by compiler internally
		System.out.println(demoListInteger.get(0));	//auto unboxing is done by compiler internally
		
		ArrayList<Float> demoListFloat=new ArrayList<>();
		demoListFloat.add(190.99f);
		System.out.println(demoListFloat.get(0));
			
	}

}
