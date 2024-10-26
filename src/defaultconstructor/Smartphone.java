package defaultconstructor;

public class Smartphone 
{
	private String brand="Samsung";
	
	public Smartphone(){
		
	}
	public Smartphone(String brand) {
		super();
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	

}
