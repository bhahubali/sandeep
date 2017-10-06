package actiTime;
import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the traffic colour");
		String colour=sc.nextLine();
		colour =colour.toLowerCase();
		switch(colour){
		case "green":
			System.out.println("proceed");
			break;
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
		case "orange" :
		case "amber":
			System.out.println("rady to take action");
			break;
			default:
				System.out.println("sorry no colour,please enter the colour");
				break;
				
				
		}

	}

}
