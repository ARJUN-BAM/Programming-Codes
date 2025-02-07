import java.util.Scanner;
class Java
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String username = null;
		String password = null;
		String address = null;
		long contact = 0;
		double balance = 0.0;
		double dupBalance = 0.0;
		double depoBalance = 0;
		double withroBalance = 0;
		System.out.println();
		main:
		for(; ;)
		{	
			System.out.println();
			System.out.println("----------------------------------");
		
			System.out.println("           WELCOME               ");
			System.out.println("     STATE BANK OF INDIA           ");
			System.out.println();
			System.out.println("1. EXISTING ACCOUNT ");
			System.out.println("2. CREATE A NEW ACCOUNT ");
			System.out.println();
			System.out.print("ENTER YOUR OPTION : ");
			int choice1 = s.nextInt();
			System.out.println();
			if(choice1==1)
			{
				for(int i=3;i>=1;i--)
				{
					if(username==null)
					{
						System.out.println("NO USER ACCOUNT FOUND!!!!");
						System.exit(0);
					}
					System.out.print("ENTER USERNAME : ");
					String username1 = s.next();
					System.out.print("ENTER PASSWORD : ");
					String password1 = s.next();
					if((username1.equals(username)) && (password1.equals(password)))
					{
						home:
						for(;;)
						{
							System.out.println();
							System.out.println("1. DEPOSIT");
							System.out.println("2. WITHDRAWL");
							System.out.println("3. CHECK BALANCE");
							System.out.println("4. MINI STATEMENT");
							System.out.println("5. LOG OUT");
							System.out.println();
							System.out.print("CHOOSE OPTIONS FOR SERIVES : ");
							int opt = s.nextInt();
							System.out.println();
							switch(opt)
							{
								case 1:
								{
									System.out.print("ENTER THE AMOUNT TO DEPOSIT : ");
									double deposit = s.nextDouble();
									balance+=deposit;
									depoBalance+=deposit;
									System.out.println("DEPOSIT SUCCESSFUL FOR !!!"+ "RS "+deposit);
									continue home;
								}
								case 2:
								{
									for(int j = 3 ; j>=1;j--)
									{
										System.out.print("ENTER PASSWORD : ");
										String password2 = s.next();
										if(password2.equals(password))
										{
											
											System.out.print("ENTER THE AMOUNT TO WITHDRAWL : ");
											double withdraw = s.nextDouble();
											if(balance>=withdraw)
											{
												balance-=withdraw;
												withroBalance+=withdraw;
												System.out.println("RS "+withdraw+" WITHDRAWL SUCCESSFUL!!!");
												continue home;
											}
											else
											{
												System.out.println("INSUFFICINT BALANCE!!!! WITHDRAWL CANCELLED ");
												continue home;
											}
											
										}else
										{
											System.out.println("INCORRECT CREDINTIAL");
											System.out.println("ATTEMPT LEFT : "+(j-1));
										}
								
									}
									System.out.println("YOU HAVE REACHED YOUR ACCESSING LIMIT!!!!");
									System.exit(0);
									
								}
								case 3 :
								{
									for(int j = 3 ; j>=1;j--)
									{
										System.out.print("ENTER PASSWORD : ");
										String password2 = s.next();
										if(password2.equals(password))
										{
											System.out.println("CURRENT BALANCE : " + balance);
											continue home;
											
										}else
										{
											System.out.println();
											System.out.println("INCORRECT CREDINTIAL");
											System.out.println("ATTEMPT LEFT : "+(j-1));
											System.out.println();
										}
								
									}
									System.out.println("YOU HAVE REACHED YOUR ACCESSING LIMIT!!!!");
									System.exit(0);
								}
								case 4 :
								{
									System.out.println("AMOUNT DEPOSITED AT THE TIME OF ACCOUNT CREATION : RS "+dupBalance);
									System.out.println("AMOUNT DEPOSITED SINCE THAN : RS "+depoBalance);
									System.out.println("AMOUNT WITHDROWLED SINCE THAN : RS "+withroBalance);

									continue home;
								}
								case 5 :
								{
									System.out.println("LOG OUT SUCCESSFUL!!!");
									continue main;
								}
								default :
								{
									System.out.println("THERE'S NO SERVICE HAVING THIS OPTION!!!");
									continue home;
								}

								
							}
						}
						

						
					}
					else
					{
						System.out.println();
						System.out.println("INCORRECT CREDINTIAL");
						System.out.println("ATTEMPT LEFT : "+(i-1));
						System.out.println();
					}
				}
				System.out.println("YOU HAVE REACHED YOUR ACCESSING LIMIT!!!!");
				System.exit(0);
			}else if(choice1 == 2)
			{
				if(!(username==null))
				{
					System.out.println("USER ACCOUNT ALREADY EXIST!!!!");
					continue;
				}
				System.out.print("ENTER YOUR USERNAME : ");
				username = s.next();
				System.out.print("ENTER YOUR PASSWORD : ");
				password = s.next();
				System.out.print("ENTER YOUR ADDRESS : ");
				address = s.next();
				System.out.print("ENTER YOUR CONTACT NUMBER : ");
				contact = s.nextLong();
				System.out.print("ENTER YOUR DEPOSIT : ");
				balance = s.nextDouble();
				dupBalance = balance;
				System.out.println("WALLAHA YOUR ACCOUNT IS CREATED!!!!!");
			}else
			{
				System.out.println("WRONG INPUT!!!!!");
			}
	
		}
		

	}
}