class Bike1{
	static int num;
	int num2;
	static {
		int num = 20;
		Bike1.num = 200;
		System.out.println("num Local : "+num);
		System.out.println("num static : "+Bike1.num);
	}
	 void showData(){
		System.out.println("num Static : "+this.num);
		System.out.println("num2 : " + num2);
	}
	public static void main(String[] args)
	{

	}
	
}


class Bike 
{
	public static void main(String [] args)
	{
		Bike1 obj = new Bike1();
		obj.num = 300;
		obj.showData();

	}
}