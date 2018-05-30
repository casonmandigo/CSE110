/*-------------------------------------------------------------------------
// AUTHOR: K Grover
// FILENAME: Assignment6.java
// SPECIFICATION:  This program allows the user to create student objects and performs operations for each student.
// FOR: CSE 110- homework #- days and time of your class
// TIME SPENT: how long it took you to complete the assignment
//----------------------------------------------------------------------*/


import java.util.*;
import java.text.*;

public class Assignment6
{
	public static void main(String[] args)
   {
     	 Scanner console = new Scanner(System.in);

     	 	String pattern = "###,###,###.##";
     	 	DecimalFormat fmt = new DecimalFormat(pattern);
     	 	
     	 	String choice;
     	 	
     		System.out.print("Enter name of the Student: ");
     		String stuName = console.nextLine();
     		System.out.println();
     		System.out.print("Enter quality points earned by " + stuName + ": ");
     		double qualityPts = console.nextDouble();
     		System.out.println();
	  		System.out.print("Enter credit hours completed by " + stuName + ": ");
	  		int credithrs = console.nextInt();

	  		Student stu1 = new Student(stuName, qualityPts, credithrs);
	  		Student stu2 = new Student ();

	  		stu2.setName("Jane Smith");


        // print the menu 
		printMenu();

		do
		{
		           // ask a user to choose a command
		           System.out.println("\nPlease enter a command ");
		           choice = console.next().toLowerCase();

		           switch (choice)
		            {
					case "a": //add course grade
								
						double pts = 0;
						int hrs = 0;
	
						System.out.print("Do you want to add course for " + stu1.getName() + ": ");
						if(console.next().toLowerCase().equals("yes"))
	{
		System.out.println();

		System.out.print("Enter the course grade (4 or 3 or 2 or 1 or 0) for " +stu1.getName() + ": ");
		pts = console.nextDouble();
		System.out.println();
		System.out.print("Enter the course credit hours for " +stu1.getName()+ ": ");
		hrs = console.nextInt();
		System.out.println();

		stu1.addCourse(pts,hrs);
	}

						System.out.print("Do you want to add course for " + stu2.getName()+ ": ");
						
	if(console.next().toLowerCase().equals("yes"))
	{
		System.out.println();

		System.out.print("Enter the course grade (4 or 3 or 2 or 1 or 0) for " +stu2.getName()+ ": ");
		pts = console.nextDouble();
		System.out.println();

		System.out.print("Enter the course credit hours for " +stu2.getName()+ ": ");
		hrs = console.nextInt();
		System.out.println();

		stu2.addCourse(pts,hrs);
	}

						break;
		
		                 case "c": //compute GPA for student
	/*******************To be completed*********************/
	
	//print the GPA for each student 
	//formatted to two decimal places using DecimalFormat class
            
	//-->
		                	 System.out.println("Student 1's GPA is: " + fmt.format(stu1.calcGPA()));
		                	 System.out.println("Student 2's GPA is: " + fmt.format(stu2.calcGPA()));
		         
						break;
					
	                 	case "p": 

	/*******************To be completed*********************/
					//print info for each student
					//by making a call to toString()method
					//-->
	                 		System.out.println(stu1.toString());
	                 		System.out.println(stu2.toString());
	                 		
					//-->

		                 break;

		                case "t": //number of students

	/*******************To be completed*********************/
					//Print the total number of students 
					//by making a call to getNumStudents() method
					//-->	        
		                	System.out.println("The total number of students are: " + Student.getNumStudents());
		                	
					break;

		                 case "?":
		                      printMenu();
		                      break;

		                 case "q":
		                      break;

		                 default:
		                       System.out.println("Invalid input");
		            }
		 } while(!choice.equals("q"));
	}// end main

public static void printMenu()
{
	System.out.print("\nCommand Options\n"
				   + "-----------------------------------\n"
				   + "a: Add course grade\n"
				   + "c: Calculate GPA\n"
				   + "p: Print student information\n"
				   + "t: Total Number of Students\n"
				   + "?: Display the menu again\n"
				   + "q: Quit this program\n\n");
}
}//end of class
