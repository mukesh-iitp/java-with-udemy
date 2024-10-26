package collections.wrapperClass;

import java.util.ArrayList;

class intWrapper
{
	public int intValue;

	public intWrapper(int intValue) 
	{
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}

public class App 
{
	public static void main(String[] args) 
	{
		/*
		ArrayList<Integer> studentNumber = new ArrayList<>();
		studentNumber.add(25);	//Auto-boxing
		System.out.println(studentNumber.get(0));	//Auto-unboxing
		*/
		
		ArrayList<intWrapper> studentNumber=new ArrayList<>();
		studentNumber.add(new intWrapper(25));	//boxing
		System.out.println(studentNumber.get(0).getIntValue());	//Unboxing
		
		ArrayList<Double> demoList=new ArrayList<>();
		//demoList.add(25.5);	//
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.1));	//this is done while autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); //this is done while unboxing
				
	}
}
