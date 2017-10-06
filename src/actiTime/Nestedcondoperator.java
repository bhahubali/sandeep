package actiTime;
import java.util.Scanner;


public class Nestedcondoperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		String res=getResult(marks);
		System.out.println("hi your result is"+res);
	}
	static String getResult(int marks){
		String result=marks>=75&&marks<=100?"distinction":marks>=60&&marks<=75?"first class ": marks>=50&&marks<60?"second class":"fail";
		System.out.println(result);
	return result;
	
	}
	
		
	}


