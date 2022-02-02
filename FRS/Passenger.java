import java.util.*; 
class Passenger
{
String PassengerName;
int Age;
Address address;
Contact contact;
	public Passenger(String PassengerName,int Age)
	{
	this.PassengerName=PassengerName;
	this.Age=Age;
	this.address= address;
	this.contact =contact;
	}
public void getPassengerDetails()
{
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a  Passenger name: ");  
	String PassengerName= sc.nextLine(); 
	System.out.print("Enter Age: ");  
	int Age= sc.nextInt();   
	

}
public void UpdatePassengerDetails()
{
	System.out.println("Passenger details updated");
}
public static void main(String[] args)
{
	Passenger ob=new Passenger("Asif",30);
	ob.getPassengerDetails();
	ob.UpdatePassengerDetails();
	//ob.getAddressDetails();
	//ob.getContactDetails();

}
}