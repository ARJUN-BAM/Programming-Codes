import java.util.Scanner;
class Election
{
	public static void main (String[] args)
	{
		System.out.println();
		System.out.println("                     WELCOME                     ");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the population : ");
		int population = sc.nextInt();
		System.out.println();
		int bjp=0,aap=0,congress=0,nota=0,mns=0,shiv=0,drawcon=0;
		for(int i = 0 ; i< population;i++)
		{
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Choose Your Party : ");
			System.out.println("1. BJP");
			System.out.println("2. AAP");
			System.out.println("3. CONGRESS");
			System.out.println("4. NOTA");
			System.out.println("5. MNS");	
			System.out.println("6. SHIV SENA");
			System.out.println();
			System.out.print("Enter Party Number : ");
			int vote = sc.nextInt();
			if(vote==1)
			{
				bjp++;
				System.out.println();
				
			}
			if(vote==2)
			{
				aap++;
				System.out.println();
			}
			if(vote==3)
			{
				congress++;
				System.out.println();
			}
			if(vote==4)
			{
				nota++;
				System.out.println();
			}
			if(vote==5)
			{
				mns++;
				System.out.println();
			}
			if(vote==6)
			{
				shiv++;
				System.out.println();
			}
			if(vote<1||vote>6)
			{
				System.out.println("Invalid Party Number!!! Try again");
				i--;
			}
		}
		if(bjp>=aap&&bjp>=congress&&bjp>=nota&&bjp>=mns&&bjp>=shiv)
		{
			System.out.println("BJP PARTY HAS WON THE ELECTION BY "+bjp+" votes.");
			return;
		}
		if(aap>=bjp&&aap>=congress&&aap>=nota&&aap>=mns&&aap>=shiv)
		{
			System.out.println("AAP PARTY HAS WON THE ELECTION BY "+aap+" votes.");
			return;
		}
		if(congress>=aap&&congress>=bjp&&congress>=nota&&aap>=mns&&aap>=shiv)
		{
			System.out.println("CONGRESS PARTY HAS WON THE ELECTION BY "+congress+" votes.");
			return;
		}
		if(nota>=aap&&nota>=congress&&nota>=bjp&&aap>=mns&&aap>=shiv)
		{
			System.out.println("NOTA PARTY HAS WON THE ELECTION BY "+nota+" votes.");
			return;
		}
		if(mns>=aap&&mns>=bjp&&mns>=nota&&mns>=congress&&mns>=shiv)
		{
			System.out.println("MNS PARTY HAS WON THE ELECTION BY "+mns+" votes.");
			return;
		}
		if(shiv>=aap&&shiv>=congress&&shiv>=bjp&&shiv>=mns&&shiv>=nota)
		{
			System.out.println("SHIV SENA HAS WON THE ELECTION BY "+shiv+" votes.");
			return;
		}
	}
}