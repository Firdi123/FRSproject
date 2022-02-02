import java.util.*; 
class Address
{
String street;
String city;
String state;
	public Address(String street,String city,String state)
	{
	this.street=street;
	this.city=city;
	this.state=state;
	}
public void getAddressDetails()
{
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a street name: ");  
	String street= sc.nextLine(); 
	System.out.print("Enter a city name: ");  
	String city= sc.nextLine(); 
	System.out.print("Enter a state name:");  
	String state= sc.nextLine();
}                      
public void UpdateAddressDetails()
{
	System.out.println("Address updated");
}
public static void main(String[] args)
{
	Address ob=new Address("saaatRasta","solapur","Maharashtra");
	ob.getAddressDetails();
	ob.UpdateAddressDetails();
}
}