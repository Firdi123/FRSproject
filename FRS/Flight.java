import java.util.*; 
class Flight
{
String FlightName;
String Airline;
int capacity=100;
int bookseat;
	public Flight(String FlightName,String Airline,int capacity,int bookseat)
	{
	this.FlightName=FlightName;
	this.Airline=Airline;
	this.capacity=capacity;
	this.bookseat=bookseat;
	}
public void getFlightDetails()
{
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a  Flight name: ");  
	String FlightName= sc.nextLine(); 
	System.out.print("Enter Name of Airline: ");  
	String Airline= sc.nextLine(); 
	System.out.print("No. of seats: ");  
	int bookseat= sc.nextInt();
}  
public boolean checkavailbility ()
{                    
if(bookseat<=capacity)
{
return true;
}
else
return false;
}
public void UpdateFlightDetails()
{
	System.out.println("Flight details updated");
}
public static void main(String[] args)
{
	Flight ob=new Flight("B105","Airindia",1,56);
	ob.getFlightDetails();
	ob.UpdateFlightDetails();
	ob.checkavailbility();
}
}