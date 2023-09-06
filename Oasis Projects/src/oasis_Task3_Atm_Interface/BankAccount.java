package oasis_Task3_Atm_Interface;

import java.util.Scanner;

public class BankAccount 
{
		String name;
		String Username;
		String Password;
		String AccountNo;
		float Balance = 10000f;
		int Transactions = 0;
		String TransactionHistory = "";

		
		private static int takeIntegerInput(int i) 
		{
			return 0;
		}

		public void register() 
		{
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter Your Name - ");
			this.name = Sc.nextLine();
			System.out.println("Enter Your Username - ");
			this.Username = Sc.nextLine();
			System.out.println("Enter Your Password - ");
			this.Password = Sc.nextLine();
			System.out.println("Enter Your Account Number - ");
			this.AccountNo = Sc.nextLine();
			System.err.println("Registration Completed. Please Log in !! ");
		}

		public boolean login() 
		{
			Scanner Sc = new Scanner(System.in);
			boolean islogin = false;

			while (!islogin) 
			{
				System.out.println("Enter Your Username  - ");
				String username = Sc.nextLine();
				if (username.equals(Username)) 
				{
					while (!islogin) 
					{
						System.out.println("Enter Your Password  - ");
						String password = Sc.nextLine();
						
						if (password.equals(Password)) 
						{
							System.err.println("Login Successful ");
							islogin = true;
						} 
						else 
						{
							System.err.println("Incorrect Password !!");
						}
					}
				} 
				else 
				{
					System.err.println("Username Not Found !!");
				}
			}
			return islogin;
		}
		
		public void withdraw ()
		{
			System.out.println("Enter Amount to Withdraw ");
			Scanner Sc = new Scanner(System.in);
			float amount = Sc.nextFloat();
			try
			{
				if(Balance >= amount)
				{
					Transactions++;
					Balance -= amount;
					System.err.println("Withdrawal Successfully ");
					String str = amount + "Rs Withdrawed\n";
					TransactionHistory = TransactionHistory.concat(str);
				}
				else
				{
					System.err.println("/nInsufficient Balanced ");	
				}
			}
			catch (Exception e)
			{
				
			}		
		}
		
		public void deposit()
		{
			System.out.println("Enter Amount to deposit ");
			Scanner Sc = new Scanner(System.in);
			float amount = Sc.nextFloat();
		
			try
			{
			 if( amount <= 10000f)
			  {
				Transactions++;
				Balance += amount ;
				System.err.println("Successfully Deposited");
				String str = amount + "Rs Deposited\n";
				TransactionHistory = TransactionHistory.concat(str);
		   	  }
			 else
			 {
		  	    System.err.println("Sorry .. Limit is 10000.00 !!");
			 }	
			}
			catch(Exception e)
			{
				
			}
		}
		public void transfer()
		{
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter Receipent Name - ");
			String Receipent = Sc.nextLine();
			System.out.println("Enter Amount to Tansfer - ");
			float amount = Sc.nextFloat();
			try
			{	
				if( Balance >= amount )
				{
		         if( Balance <= 50000f )
		         {	
				  Transactions++;
				  Balance -= amount ;
				  System.out.println("Successfully Transfered to" + Receipent);
				  String str = amount + "Rs Transfer to " + Receipent + "\n";
				  TransactionHistory = TransactionHistory.concat(str);
				 }
		         else
		         {
				  System.err.println("Sorry .. Limit is 50000.00 !!");
				 }
			}
				else
				{
				 System.err.println("Insuficient Balanced	!!");
			    }
				}
			catch(Exception e)
			{
				
			}
		}
	    public void checkBalanced()
	    {
	    	System.out.println("\n " + Balance + " Rs ");
        }
	    
	    public void transHistory()
	    {
		 if(Transactions == 0 )
		 {
			System.err.println("Empty ");
		 }
		 else
		 {
			System.out.println("\n " + TransactionHistory);	
		 }
	}
	}