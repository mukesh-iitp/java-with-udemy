package encapsulation;

public class Person 
{
	private String name;
	private int age;
	private String gender;

	/*
	 * public Person() { this.name = "John"; this.age = 25; this.gender = "male";
	 * 
	 * }
	 */
	
	public Person(String name, int age, String gender) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String setAge(int age) 
	{
		if(age>=0 && age<=100)
		{
			this.age = age;
			return "Entered age is set";
		}
		else
			return "Invalid age passed.Age remains same.";
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	
	

}
