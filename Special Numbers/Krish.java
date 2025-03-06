class Krish{
	public static void main(String[] args) {
		int num = 145;
		int sum = 0;
		for(int i=num;i>0;i/=10)
		{
			int rem = i%10;
			int fact = 1;
			
			while(rem>0)
			{
				fact*=rem;
				rem--;
			}
			sum+=fact;

		}
		System.out.println((sum==num)?("Krish"):("Not krish"));
	}
}