//***********************************************************
//Name: Cason Mandigo
//Title: Assignment #2
//Description: 
//Time spent: About 45 Minutes
//Date: 9/8/2016
//**************************************************************

//************************************************************
// Part 1: Writing Exercise
//
// 1. System.out.println(myString.length());
//    System.out.println(myString.charAt(16));
//    System.out.println(myString.toUpperCase());
//
// 2. Hy
//
//************************************************************

// Part 2: Programming

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2 
{
	public static void main (String[] args)
	{
		
		// Task 1
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the room rent?");
		double roomRent = in.nextDouble();
		System.out.println("What is cost for utilities?");
		double utilitiesBill = in.nextDouble();
		System.out.println("What is the TV/Internet bill?");
		double tvBill = in.nextDouble();
		double roomMates = 3;
		
		double costShare = (roomRent + utilitiesBill + tvBill) / roomMates;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("Each roommate's share of the rent and utilities is: " + money.format(costShare));
		
		
		// Task 2
		
		final int INCHES_PER_FOOT = 12;
		final int FEET_PER_YARD = 3;
		
		System.out.println("Enter a total number of inches:" );
		int totalInches = in.nextInt();
		
		int totalFeet = totalInches / INCHES_PER_FOOT;
		int leftOverInchesFromFeet = totalInches % INCHES_PER_FOOT;
		int totalYards = totalFeet / FEET_PER_YARD;
		int leftOverFromYards = totalFeet % FEET_PER_YARD;
		int actualFeet = totalFeet + leftOverFromYards;
		
		System.out.println(totalYards + " yards, " + leftOverFromYards + " feet, and " + leftOverInchesFromFeet + " inches");
		

		
		
		
	}
}
