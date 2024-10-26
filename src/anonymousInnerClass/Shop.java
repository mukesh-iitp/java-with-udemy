package anonymousInnerClass;

import anonymousInnerClass.door.Door;

public class Shop 
{
	public static void main(String[] args) 
	{
		Door door=new Door();
		if(door.getLock().isUnlocked("werty"))
			System.out.println("Welcome! we are open");
		else
			System.out.println("We are closed, please visit later.");
		
	}

}
