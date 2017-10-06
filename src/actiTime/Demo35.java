package actiTime;
import java.util.Scanner;

public class Demo35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter country code");
		String ccode=sc.nextLine();
		ccode=ccode.toLowerCase();
		char ch=ccode.charAt(0);
		switch(ch)
		{
		case 'i':
			System.out.println("india");
			break;
		case 'j':
			System.out.println("japan");
			break;
		case 'r':
			System.out.println("rajastan");
			break;
			
		}
		
		
	}

}
