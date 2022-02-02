import java.util.*; 
class Contact
{
String contactName;
String contactPhone;
String contactEmail;
	public Contact(String contactName,String contactPhone,String contactEmail)
	{
	this.contactName=contactName;
	this.contactPhone=contactPhone;
	this.contactEmail=contactEmail;
	}
public void getContactDetails()
{
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a  contact name: ");  
	String contactName= sc.nextLine(); 
	System.out.print("Enter a Contact number: ");  
	String contactPhone= sc.nextLine(); 
	System.out.print("Enter a email id:");  
	String contactEmail= sc.nextLine();
}                      
public void UpdateContactDetails()
{
	System.out.println("Contact updated");
}
public static void main(String[] args)
{
	Contact ob=new Contact("saaatRasta","solapur","Maharashtra");
	ob.getContactDetails();
	ob.UpdateContactDetails();
}
}