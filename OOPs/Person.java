class Person 
{
	String name="arjun";
	int age;
	float height=173.5f;
	float weight = this.height;
	static String species;
	static {
		int species = 1;
		Person.species = "Human";
		System.out.println("We are using a person class, This is static block.");
		System.out.println(species+" : Int");
		System.out.println(Person.species+" : String");

	}
	{
		System.out.println(name+" is of "+age+"years.");
		String name = "Lokesh";
		System.out.println(name+" is of "+age+"years.");
		System.out.println(name+" and "+this.name+" are brothers.");
		System.out.println("Someone just borned");
	}
	Person(){
		System.out.println("This is no-argument Constructor working.");
	}
	Person(String name,int age,float height,float weight){
		System.out.println("this is a Parameterized Constructor");
		this.name = name;
		this.age = age;
		this.height= height;
		this.weight = weight;
		System.out.println(Person.species);
		
	}
	public void walk(){
		System.out.println("Person is Walking");
	}
	public void talk(){
		System.out.println("Person is talking");
	}
	public void eat(){
		System.out.println("Person is eating");
	}
}