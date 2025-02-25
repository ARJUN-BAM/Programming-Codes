/*
interface b1{
	void show1();
}

interface b2{
	void show2();
}

class Encapsulation implements b1,b2
{
	public void show1(){
		System.out.println("b1");
	}
	public void show2(){
		System.out.println("b2");
	}
	public static void main(String [] args)
	{
		Encapsulation obj = new Encapsulation();
		obj.show1();
		obj.show2();
		System.out.println();
		try{
			int num = 10/0;
		}
		catch(Exception e)
		{
			System.out.println("Exception Name: "+e);
		}

	}
}
*/


class base{
	public void show()
	{
		System.out.println("Base Class");
	}
}
public class Encapsulation extends base
{
	@Override
	public void show(){
		System.out.println("Derived Class");
	}
	public static void main(String [] args)
	{
		base obj = new Encapsulation();
		obj.show();
		base obj2 = new base();
		obj2.show();
	}
}