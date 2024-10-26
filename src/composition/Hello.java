package composition;

import composition.laptop.Laptop;
import composition.laptop.components.GraphicsCard;
import composition.laptop.components.Processor;

public class Hello 
{
	public static void main(String[] args) 
	{
		Laptop lappy=new Laptop();
		System.out.println(lappy);
		System.out.println("---------------------------\n");
		System.out.println(lappy.getProcessor().getBrand());
		System.out.println("---------------------------\n");
		
		//Laptop gaminglaptop=new Laptop(17f, new Processor("intel", "7200U", 7, 4, 4, "6MB"+"", "2.5Ghz", "2.5Ghz", "3.1Ghz"), "DDR4", "2TB", new GraphicsCard("Nvidia", 1050, "4GB"), "toshiba", "backlit");
		//alternate option is as below:
		Processor processor=new Processor("intel", "7200U", 7, 4, 4, "6MB"+"", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard grphicscard=new GraphicsCard("Nvidia", 1050, "4GB");
		Laptop gaminglaptop=new Laptop(17f, processor, "DDR4", "2TB", grphicscard, "LG", "backlit");
		System.out.println(gaminglaptop);
		System.out.println("---------------------------\n");
		
		gaminglaptop.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println(gaminglaptop);
		System.out.println("Current frequency="+gaminglaptop.getProcessor().getFrequency());
		System.out.println("---------------------------\n");
	}

}
