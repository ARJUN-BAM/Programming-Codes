// 2 6 22 278 65814
class Series
{
	public static void main(String[] args) {
		int sum=2;
		int temp=2;
		System.out.print(sum+" ");
		for(int i=2;i<6;i++)
			{
				sum = (temp*temp)+sum;
				temp*=temp;
				System.out.print(sum+" ");
			}
		}
}