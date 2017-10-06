package actiTime;
import java.util.Scanner;
public class Demo21 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your name ");
String name=sc.nextLine();
System.out.println("enter your marks");
int marks=sc.nextInt();
System.out.println("enter your subject");
String subject=sc.nextLine();
String w=sc.nextLine();
String result=marks>50?"pass":"fail";
System.out.println(" hi "+name+" your result is  "+result+"  in subject  "+subject);

	}

}
