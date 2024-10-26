package anonymousInnerClass.door;

public class Door 
{
	Lock lock=new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) 
		{
			if(keyCode.equals("qwerty"))
				return true;
			return false;
		}
		
	};
	public Lock getLock() 
	{
		return lock;
	}
	
}
