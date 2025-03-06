import java.util.*;
class Restourent 
{
	public static String accName ;
	public static String passWord ;
	public static double totalBill ;
	public static ArrayList<String> items = new ArrayList<String>();
	public static void main(String [] args)
	{
		for (;;)
		{
			System.out.println();
			System.out.println("                 WELCOME TO THE JAVA KA DHABA");
			System.out.println();
			System.out.println("1. Existing Account	");
			System.out.println("2. Create Account	");
			System.out.println("3. Exit Application	");
			System.out.println();
			System.out.print("CHOOSE ONE OPTION : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			System.out.println();
			switch(choice)
			{
				case 1: logIn(sc);break;
				case 2: newAcc(sc);break;
				case 3: System.out.println("Thank You!!! Please Visit Again"); return ;
				default: System.out.println("Wrong Input Please Try again");
			}
		}
	}
	public static void logIn(Scanner sc)
	{
		System.out.println();
		if(accName==null)
		{
			System.out.println("ACCOUNT NOT FOUND!!! CREATE IT");
			System.out.println();
			return;
		}
		int attempt = 3;
		for(;attempt>=1;attempt--)
		{
			System.out.print("Enter the Account Name : ");
			String logAccName = sc.next();
			System.out.print("Enter the Password : ");
			String logPassWord = sc.next();
			if(logAccName.equals(accName)&&logPassWord.equals(passWord))
			{
				System.out.println("LOGIN SUCCESSFUL!!!!");
				System.out.println();
				homePage(sc);
				return;
			}
			else
			{
				System.out.println("WRONG CREDENTIALS!!! TRY AGAIN");
				System.out.println("ATTEMPT LEFT : "+(attempt-1));
				System.out.println();
			}
		}
		if(attempt==0)
		{
			System.out.println(" TO MANY WRONG ATTEMPTS !!!! YOU ARE NO LONGER A USER");
			System.exit(0);
		}
		
	}
	public static void newAcc(Scanner sc)
	{
		if(!(accName==null))
		{
			System.out.println("ACCOUNT ALREADY EXISTED!!!");
			return ; 
		}
		System.out.print("Enter the Account Name : ");
		accName = sc.next();
		System.out.print("Enter the Password : ");
		passWord = sc.next();
		System.out.println();
		System.out.println("ACCOUNT CREATED!!!");
		System.out.println();
	}
	public static void homePage(Scanner sc)
	{
		for (;;)
		{
			System.out.println();
			System.out.println("                This is home Page");
			System.out.println();
			System.out.println("1. Give Order	");
			System.out.println("2. View Cart	");
			System.out.println("3. Confirm order");
			System.out.println("4. Main Page");
			System.out.println();
			System.out.print("CHOOSE ONE OPTION : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: orderItem(sc); break;
				case 2: viewCart(sc); break;
				case 3: confirmOrder(sc); break;
				case 4: return;
				default: System.out.println("Wrong Input Please Try again");
			}
		}	
	}
	public static void viewCart(Scanner sc)
	{
		if(items.isEmpty())
		{
			System.out.println("Basket is Empty!!!!");
			return;
		}
		for (;;) 
		{
			System.out.println();
			System.out.println("                 CART");
			System.out.println();
			for(String item:items)
			{
				System.out.println(item);
			}
			System.out.println();
			System.out.println("1. Remove one Item	");
			System.out.println("2. Empty Basket	");
			System.out.println("3. Add more items	");
			System.out.println("4. Home Page	");
			System.out.println();
			System.out.print("CHOOSE ONE OPTION : ");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice)
			{
				case 1:
				{
					removeItem(sc);
					break;
				}
				case 2: items.clear(); System.out.println("Cart has Been Emptied!!!!"); break;
				case 3: orderItem(sc);break;
				case 4: return ;
				default: System.out.println("Wrong Input Please Try again");
			}
		}
	}
	public static void removeItem(Scanner sc)
	{
		if(items.isEmpty())
		{
			System.out.println("No Items to Remove!!!!");
			return;
		}

		System.out.println();
		System.out.print("Enter the Item Number :");
		int iT = sc.nextInt();
		if(iT>105||iT<101)
		{
			System.out.println("No item of that Item Number!!!");
			return;
		}
		int index = 0;
		for(String item: items)
		{
			String [] arr = item.split("[ ]");
			if(arr[0].equals(iT+".")){
				items.remove(index);
				System.out.println("Item Removble Successful!!!");
				break;
			}
			index++;
		}
		if(index==items.size())
		{
			System.out.println("Item Not Found!!!");
			return ; 
		}
	}
	public static void orderItem(Scanner sc)
	{
		System.out.println();
		for (; ; )
		{
			System.out.println("                    ITEM LIST ");
			System.out.println();
			System.out.println("Option    I.N.    item              rate");
			System.out.println("1.        101     Upma	            30/-");
			System.out.println("2.        102     Sambar_Chatni     45/-");
			System.out.println("3.        103     Dosa              25/-");
			System.out.println("4.        104     Idli              35/-");
			System.out.println("5.        105     Butter_chicken    125/-");
			System.out.println("6.        Back");
			System.out.println();
			System.out.print("CHOOSE YOUR DISH : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: items.add("101. Upma                RS. 30"); System.out.println("  Item : Upma 30/- Added!!! "); break;
				case 2: items.add("102. Sambar_Chatni       RS. 45"); System.out.println("  Item : Sambar_Chatni 45/- Added!!! "); break;
				case 3: items.add("103. Dosa                RS. 25"); System.out.println("  Item : Dosa 25/- Added!!! "); break;
				case 4: items.add("104. Idli                RS. 35"); System.out.println("  Item : Idli 35/- Added!!! "); break;
				case 5: items.add("105. Butter_chicken      RS. 125"); System.out.println("  Item : Butter_chicken 125/- Added!!! "); break;
				case 6: return;
				default: System.out.println("Wrong Input Please Try again");
			}	
		}

	}
	
	public static void confirmOrder(Scanner sc)
	{
		if(items.isEmpty())
		{
			System.out.println("Basket is Empty!!!!");
			return;
		}

		for (; ; ) 
		{
			System.out.println();
			System.out.println("                CONFIRM YOUR ORDER");
			System.out.println();
			for(String item:items)
			{
				System.out.println(item);
				String [] arr = item.split("\\s+");
				totalBill += Double.parseDouble(arr[3]);
			}
			System.out.println("YOUR TOTAL BILL : "+ "Rs. "+totalBill+"/-");
			System.out.println();
			System.out.println("1. Use GPay/Paytm	");
			System.out.println("2. Cash	");
			System.out.println("3. Udhar	");
			System.out.println("4. Home Page	");
			System.out.println();
			System.out.print("CHOOSE ONE OPTION : ");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice)
			{
				case 1:
				{
					items.clear(); 
					totalBill = 0;
					System.out.println("Online Transaction Successful!!!!");
					return ; 
				}
				case 2: items.clear(); totalBill = 0; System.out.println("Cash Paid!!!!!"); break;
				case 3: items.clear(); totalBill = 0;System.out.println("Udar Given!!!!");;break;
				case 4: return ;
				default: System.out.println("Wrong Input Please Try again");
			}

			
		}

	}
}