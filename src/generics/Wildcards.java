package generics;

import java.util.List;
import java.util.ArrayList;

class Vehicle
{
	private int VehicleID;

	public Vehicle(int vehicleID) 
	{
		VehicleID = vehicleID;
	}

	public int getVehicleID() 
	{
		return VehicleID;
	}

	@Override
	public String toString() 
	{
		return "Vehicle [VehicleID=" + VehicleID + "]";
	}	
	void info() {
		System.out.println("Vehicle ID is "+getVehicleID());
	}
}

class Car extends Vehicle
{
	private String CarModel;

	public Car(int vehicleID, String carModel) 
	{
		super(vehicleID);
		CarModel = carModel;
	}

	public String getCarModel() 
	{
		return CarModel;
	}

	@Override
	public String toString()
	{
		return "Car [CarModel=" + CarModel + "]";
	}
	void info() {
		System.out.println("Car Model is "+getCarModel());
	}
}

public class Wildcards 
{
	public static void main(String[] args) 
	{
		List<Vehicle> list=new ArrayList<>();
		//List<Object> list=new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14,"A14"));
		//list.add(new String("A string object"));
		display(list);
	}
	//public static void display(List<?> list)
	//public static void display(List<? extends Vehicle> list)	//upper bound Vehicle
	public static void display(List<? super Car> list)
	{
		for(Object element:list)
		//for(Vehicle element:list)
			System.out.println(element);
			//element.info();
	}
	
}
