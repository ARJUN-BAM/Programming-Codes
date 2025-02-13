//144 2197 196 3375 256
class Series0
{
	public static void main(String[] args) {
		for(int i=12;i<=20;i++)
		{
			int pow = 2;
			if(i%2==1)
				pow=3;
			int num = 1;
			while(pow>0)
			{
				num*=i;
				pow--;
			}
			System.out.print(num + " ");
	}
		}
}