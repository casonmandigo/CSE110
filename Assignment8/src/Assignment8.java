//***********************************************************
// Name: Cason Mandigo
// Title: Assignment8.java
// Description: last assingment
// Time spent: about 2 hours
// Date: 11/28/16
//************************************************

//*************************************************************
//
// Part 1: Written exercises
//	1. 
//		char [] charArray = new char[26];
// 			This is valid, it declares the array and reserves 26 memory slots
//		int [] words = new words[10];
//			This is not valid, after new and before [10] there should be "int" not words, as words is not the type of data stored in the array it is int
//		char [] charArray = "Computer Science";
// 			This array is invalid because in its current form the data types are miss matched, it is initailized as char, but the second half is a string
//		double[3] nums = [3.5, 25.1, 32.0];
//			This array is invalid because of the [3], the brackets should be empty
//	2.
//		a. 0
//		b. 9
//		c. 2
//

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment8 
{
	public static void main (String[] args) throws IOException
	{
		
		Airline united = new Airline("United");
		printMenu();
		String command;
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.print("Please enter a command or type ?: ");
			command = in.next();
			
			switch (command)
			{
				case "r":
					if (united.isAllFull())
					{
						System.out.println("Sorry! This flight is full");
					}
					if (!united.isAllFull())
					{
						int row;
						int column;
						System.out.print("Please enter desired row");
						row = in.nextInt();
						System.out.println("Please enter desired column");
						column = in.nextInt();
						if (!united.checkAvailability(row, column))
						{
							System.out.println("Sorry! Your requested seat is not available");
						}
						if (united.checkAvailability(row, column))
						{
							System.out.println("This seat is available!");
							double cost = united.priceCheck(row, column);
							System.out.println("Would you like to reserve this seat for " + cost);
							String ansewr;
							ansewr = in.next();
							if (ansewr.equals("yes"))
							{
								united.makeReservations(row, column);
								System.out.println("Your seat has been reserved");
								united.seatCounter(row, column);
							}
							else
							{
								System.out.println("You can try other options!");
							}
						}
						break;
					}
					
				case "d":
					united.displaySeats();
					united.display();
					break;
				case "?":
					printMenu();
					break;
				case "q":
					break;
				default:
					System.out.print("\n\t [Invalid input]");
					break;
				
			}
		}
		while (!command.equals("q"));
	}
	
	public static void printMenu()
	{
		System.out.print("\n New-Air Airlines \n"
			+ "-----------------------------------\n"
			+ "r: Request a seat!\n"
			+ "d: Display all seats!\n"
			+ "?: Display the menu again\n"
			+ "q: Quit this program\n");
	}

}
