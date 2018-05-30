import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Airline
{
	
	private static final int MAX_COLUMNS = 6;
	private static final int MAX_ROWS = 30;
	
	private int seatsSold = 0;
	private int seatsAvailable = 180;
	private double money = 0;
	
	String [][] seatArray;
	double [][] priceArray;
	
	FileReader fp;
	Scanner scan;
	
	public Airline (String input) throws FileNotFoundException
	{
		String airlineName = input;
		seatArray = new String[MAX_ROWS][MAX_COLUMNS];
		priceArray = new double [MAX_ROWS][MAX_COLUMNS];
		
		fp = new FileReader("seatPrices.txt");
		scan = new Scanner(fp).useDelimiter(":|\n");
		
		start();
		
	}
	
	public void start()
	{
		
		for (int i = 0; i < MAX_ROWS; i++)
		{
			for (int j = 0; j < MAX_COLUMNS; j++)
				{
					seatArray[i][j] = "?";
					//priceArray[i][j] = 0;
					if (scan.hasNext()) {
						//System.out.println();
						priceArray[i][j] = Double.parseDouble(scan.next());
					}
					
					
				}
			//scan.nextLine();
		}		
	}
	
	public boolean checkAvailability (int x, int y)
	{
		boolean u = false;
		if (seatArray[x-1][y-1] == "?")
		{
			u = true;
		}
		if (seatArray[x-1][y-1] == "#")
		{
			u = false;
		}
		return u;
	}
	
	public void makeReservations (int x, int y)
	{
		seatArray[x-1][y-1] = "#";
	}
	
	public double priceCheck(int x, int y)
	{
		double c = priceArray[x-1][y-1];
		return c;
	}
	
	public boolean isAllFull()
	{
		boolean u = true;
		for (int i = 0; i < MAX_ROWS; i++)
		{
			for (int j = 0; j < MAX_COLUMNS; j++)
			{
				if (seatArray[i][j] == "?")
					u = false;
					
			}
		}
		return u;
	}
	
	public void displaySeats()
	{
		for (int i = 0; i < MAX_ROWS; i++)
		{
			int count = 0;
			for (int j = 0; j < MAX_COLUMNS; j++)
			{
				System.out.print(seatArray[i][j]);
				count++;
				if (count == 3)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Legend:");
		System.out.println("# = Occupied");
		System.out.println("? = Available");
	}
	
	public void seatCounter(int x, int y)
	{
		seatsSold++;
		seatsAvailable--;
		money = money + priceArray[x-1][y-1];
	}
	
	public void display()
	{
		System.out.println("Total seats sold = " + seatsSold);
		System.out.println("Total seats available = " + seatsAvailable);
		System.out.println("Total amount collected from the sale = $" + money);
		System.out.println();
	}
	
}
