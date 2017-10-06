package actiTime;
import java.util.Scanner;


public class Demo34 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter ipl team");
String ipl=sc.nextLine();
ipl =ipl.toLowerCase();
switch(ipl)
{
default:
	System.out.println("not any team");
	break;
case "mi":
	System.out.println("mumbai indians");
	break;
case "rcb":
	System.out.println("royal challenge bangalore");
	break;
case "srh":
	System.out.println("sun rises hyderabad");
	break;
	
}

	}

}
