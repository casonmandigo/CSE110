import java.text.DecimalFormat;

/*-------------------------------------------------------------------------
// AUTHOR: Cason Mandigo
// FILENAME: Student.java
// SPECIFICATION: This program is for working with classes and objects.
// FOR: CSE 110 - Assignment6
// TIME SPENT: 30 Minutes
//----------------------------------------------------------------------*/

public class Student
{
	private String name;
	private double qualityPoints;
	private int creditHours;
	private int studentID;
	private static int numOfStudents = 0;
	
	String pattern = "###,###,##0.00";
	DecimalFormat fmt = new DecimalFormat(pattern);
	
	public Student()
	{
		name = "???";
		qualityPoints = 0.0;
		numOfStudents++;
		studentID = numOfStudents;
	}
	
	public Student (String name, double qualityPoints, int creditHours)
	{
		this.name = name;
		this.qualityPoints = qualityPoints;
		this.creditHours = creditHours;
		numOfStudents++;
		studentID = numOfStudents;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public double calcGPA()
	{
		if (qualityPoints > 0 && creditHours > 0)
		{
			double gpa = qualityPoints / creditHours;
			return gpa;
		}
		else
		{
			double gpa = 00.000;
			return gpa;
		}
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void addCourse (double courseGrade, int courseHours)
	{
		this.qualityPoints = qualityPoints + (courseGrade * courseHours);
		this.creditHours = (this.creditHours + courseHours);
	}
	
	public static int getNumStudents()
	{
		
		return numOfStudents;
	}
	
	public String toString()
	{
		double gpa;
		if (qualityPoints > 0 && creditHours > 0)
		{
			gpa = qualityPoints / creditHours;
		}
		else
		{
			gpa = 00.0000;
		}
		String info = "The students name is: " + name + ", the students Cumulative GPA is: " + fmt.format(gpa) + ", the students id is: " + studentID;
		
		return info;
	}
	
}
