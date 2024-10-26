package collections.stack;

import java.util.Stack;

public class ClassA 
{
	public static void main(String[] args) 
	{
		Stack<Integer> demoStack=new Stack<>();
		demoStack.push(0);
		demoStack.push(1);
		demoStack.push(2);
		demoStack.push(3);
		demoStack.push(4);
		demoStack.push(5);
		
		for(Integer temp:demoStack)
			System.out.println(temp);
		
		System.out.println("-------");
		demoStack.pop();
		for(Integer temp:demoStack)
			System.out.println(temp);
		
		System.out.println("-------");
		System.out.println(demoStack.peek());
		
		System.out.println("-------");
		System.out.println(demoStack.isEmpty());
		
		System.out.println("-------");
		System.out.println(demoStack.search(0));
		System.out.println(demoStack.search(100));
		
		
	}

}
