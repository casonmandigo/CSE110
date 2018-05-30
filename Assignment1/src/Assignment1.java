//***********************************************************
//Name: Cason Mandigo
//Title: Assignment #1
//Description: This program asks the user to enter their
//name and the outside temperature in Fahrenheit.
//the program then converts the temperature to Celsius
//and prints the users name and the outside temperature
//in Celsius. 
//Time spent: About 45 Minutes
//Date: 9/3/2016
//**************************************************************

//***********************************************************
//Part 1
//
//Question 1:
//int userAge;
//System.out.println("Please enter your age");
//userAge = scan.nextInt();
//
//Question 2:
//int books = 2;
//int pencils = 10;
//System.out.printf("%-8s%8f", "Books:", books);
//System.out.printf("%-8s%8f", "Pencils:", pencils);
//
//************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1
{
	public static void main (String[] args)
	{
		// Creation of Scanner and usersName variable
		Scanner in = new Scanner (System.in);
		String userName;
		// Getting user input for name
		System.out.println("What is your name?");
		userName = in.next();
		// Defining and asking user for outside temp in F
		System.out.println("What is the temperature in Fahrenheit?");
		int tempF;
		tempF = in.nextInt();
		// Converting F temp to C temp
		double cel1;
		cel1 = (tempF - 32);
		double cel2;
		cel2 = cel1 * 5;
		Double celF;
		celF = cel2 / 9;
		// Formating of output creation
		DecimalFormat fmt = new DecimalFormat ("0.##");
		// Return message to user with name and C temp
		System.out.println("Hi" + " " + userName + ", today's temperature according to the Celsius scale is" + " " + fmt.format(celF));
	}
}
