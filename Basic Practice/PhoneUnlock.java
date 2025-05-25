import java.util.Scanner;
class PhoneUnlock
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc =  new Scanner(System.in);
		int storePassword = 1234;
		int sec = 5000;
		for(;;)
		{
			int attempt = 3;
			do
			{
				System.out.print("Enter Your PIN : ");
				int pin = sc.nextInt();
				if(pin==storePassword)
				{
					System.out.println("PHONE UNLOCKED!!!");
					System.exit(0);
				}
				else
				{
					System.out.println("INVALID PIN!!!");
					System.out.println("ATTEMPT LEFT : "+(attempt-1));
				}
				attempt--;
			}while(attempt>0);
			System.out.println("PHONE IS DESALBLED FOR "+(sec/1000)+" SECONDS");
			Thread.sleep(sec);
			sec*=2;
		}
	}
}
		