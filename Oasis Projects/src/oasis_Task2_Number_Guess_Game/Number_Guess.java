package oasis_Task2_Number_Guess_Game;

import java.util.Random;
import java.util.Scanner;

public class Number_Guess 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.err.println("!!!NUMBER GUESSING GAME!!!");
		 System.err.println("# The system generates a random number from a given range 1 to 100.");
		 System.err.println("# You have to enter their given number by guessing it.");
		 System.err.println("# The computer then tells if the entered number matches the guesses number or it is higher/lower than the generated number.");
		 System.err.println("The game continues under the user guessing the number.");
		 System.err.println("YOU HAVE 3 ATTEMPTS TO GUESS THE CORRECT NUMBER");
		 Number_Guess ex=new Number_Guess();
		 ex.guessGame();
		 while(true)
		 {
		 System.err.println("Press 1 to Add Another Round OR PRESS ANY KEY TO EXIT GAME!!!");
		 if (sc.nextInt()==1) 
		 {
			 ex.guessGame();
		 }
		 }
	}
	public void guessGame()
	{
		Scanner sc=new Scanner(System.in);
		 Random random= new Random();
		 int rr= random.nextInt(100);
//		 System.out.println(rr);
		 for(int j=1;j<=3;j++)
		 {
			 System.out.print("Guess a Number: ");
			 int guess=sc.nextInt();
			 
		  if (rr==guess && (j==1||j==2||j==3))
		  {
			System.err.println("You have Guessed Correct Number in "+ j+" Attempt Your SCORE is: "+(10/j));
			return;
	   	  }
		  else if (rr!=guess && j>3) 
		  {
			System.err.println("You Guessed Wrong number!! Attempt "+j+ " Failed! All Attempts Exhausted!! Your SCORE is: 0 ! The Number Generated is: "+rr);
			return;
	   	  }
		  else if (rr!=guess && guess>rr)
		  {
			System.err.println("You have Guessed a Wrong Number!! Attempt "+j+" Failed!!"+" Guessed Number is Greater than the system generated number.");
		  }
		  else if (rr!=guess && guess<rr)
		  {
			System.err.println("You have Guessed a Wrong Number!! Attempt "+j+" Failed!!"+" Guessed Number is Smaller than the system generated number.");
		  }
		 }
	}
}