import java.util.*; 
import java.io.*;
class Ticket
{
String PNR;
String Origin;
String Destination;
//Fight flight;
String DepartureDateTime;
String SeatNo;
float price;
boolean cancel;

	public Ticket(String PNR,String Origin,String Destigation)
	{
	this.PNR=PNR;
	this.Origin=Origin;
	this.Destination=Destination;
	}
public void getAddressDetails()
{
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter Origin: ");  
	String Origin= sc.nextLine(); 
	System.out.print("Enter Destination: ");  
	String Destination= sc.nextLine(); 
}                      
public void UpdateAddressDetails()
{
	System.out.println("Ticket updated");
}
public static void main(String[] args)
{
	Ticket ob=new Ticket("kcbncm"," nnj","Mahara");
	ob.getAddressDetails();
	ob.UpdateAddressDetails();
	ob.bookTicket();
}
public void bookTicket()
{Scanner sc= new Scanner(System.in);
 InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader x=new BufferedReader(isr);
    int tp=0, c=0, no=0, r, o;
    boolean flag = true;
    boolean ar[][]=new boolean[10][4];
    System.out.print("***********WELCOME TO TICKET RESERVATION SYSTEM***********");
    System.out.println();
    System.out.println();
    System.out.println("                TICKET RESERVATION");
    while(no<10 && flag==true)
        {
    System.out.println("                   Main Menu");
    System.out.println("1. Book Ticket");
    System.out.println("2. Exit");
    System.out.print("Enter Choice   :");
    //int choice = Integer.parseInt(x.readLine());
int choice= sc.nextInt(); 
    switch (choice)
    {
        case 1:

          System.out.println();
                System.out.println();
                System.out.print("*********FRS***********");
                System.out.println();
                System.out.println("Enter the number for the station as given in the menu below");
                System.out.println("1 for Station A");
                System.out.println("2 for Station B");
                System.out.println("3 for Station C");
                System.out.println("4 for Station D");
                System.out.println("5 for Station E");


                System.out.print("Origin: ");
                //int s=Integer.parseInt(x.readLine());
                //Scanner sc= new Scanner(System.in);
	int s= sc.nextInt();
	System.out.print("DESTINATION STATION: ");
                //int d=Integer.parseInt(x.readLine());
                int d= sc.nextInt();
	s=--s;
                d=--d;
               /*Here how do I check if seats are available or not?*/
                int f=0;
        String starttime="", reaching="";
           if(s==0 && d==1)
            {

                f = 50;
                starttime = "08:00";
                reaching = "10:00";
            }
                 if(s==0 && d==2)
            {
                int a =0;
                int b =2;
                f = 100;
                starttime = "08:00";
                reaching = "12:00";
            }
            if(s==0 && d==3)
            {

                f = 150;
                starttime = "08:00";
                reaching = "14:00";
            }
             if(s==0 && d==4)
            {
                int a =0;
                int b =4;
                f = 200;
                starttime = "08:00";
                reaching = "16:00";
            }
             if(s==1 && d==2)
            {

                f = 50;
                starttime = "10:00";
                reaching = "12:00";
            }
             if(s==1 && d==3)
            {

                f = 100;
                starttime = "10:00";
                reaching = "14:00";
            }
             if(s==1 && d==4)
            {

                f = 150;
                starttime = "10:00";
                reaching = "16:00";
            }
             if(s==2 && d==3)
            {

                f = 50;
                starttime = "12:00";
                reaching = "14:00";
            }
             if(s==2 && d==4)
            {

                f = 100;
                starttime = "12:00";
                reaching = "16:00";
            }
             if(s==3 && d==4)
            {

                f = 50;
                starttime = "14:00";
                reaching = "16:00";
            }
           if (s==4 || d==0)
           {
             System.out.println ("Wrong Choice. Your ticket was not booked");

            }

                for (int i=0; i<no; i++)
                {
                    for (int j=s; j<=d; j++)
                    {
                        ar[i][j]=true;
                    }
                }

                /*
                Now what I have been unable to do is. Suppose a person
                is going from station A to B. Then row 1 column 1 is
                true, and if the next passenger wants to book from B-D
                then how do I get the seat booked in the row 1 if there
                is space available. And is seat is not available then
                it should go to row 2. How do I do that? What I am
                doing is "no++" so it goes to row next every time
                */


                    System.out.print("ENTER THE NAME: ");
                    //String people=x.readLine();
                   String people= sc.nextLine();
	System.out.print("ENTER THE AGE: ");
                    //int age=Integer.parseInt(x.readLine());
                    int age= sc.nextInt();
	System.out.print("GENDER OF THE PERSON: ");
                    String gender=sc.nextLine();
                    System.out.print("DATE OF JOURNRY: ");
                    String date2=sc.nextLine();

                System.out.println();
                System.out.println();
                System.out.println("      *****RESERVATION TICKET*****");

                    System.out.println("Name :"+people+"     "+"Age :"+age+"      "+"Gender :"+gender+"       ");




            System.out.println();
                System.out.println("START STATION: "+s);
                System.out.println("Boarding time: " + starttime);
                System.out.println("DESTINATION STATION: "+d);
                System.out.println("Expected time of Arrival:" + reaching);
                System.out.println();
           System.out.println("TOTAL AMOUNT: "+ f);
                System.out.println();
                System.out.println(" ***WISH YOU A HAPPY AND SAFE JOURNEY***");
                System.out.println("COURTESY: ROMIT RAILWAY STATION");


                break;


                case 2:
                flag=false;
                System.out.println ("You have exited");
                break;
                default: System.out.println("Choice Does not Exit");


    }
    no=no++;
}
}
}