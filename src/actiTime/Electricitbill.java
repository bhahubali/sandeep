package actiTime;
 import java.util.Scanner;

public class Electricitbill {

	public static void main(String[] args) {

      double amount=0.0;
      double discount=0.0;
      double fineamount=0.0;
      double totalamount=0.0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the units");
      int units=sc.nextInt();
      System.out.println("enter the previous amount balance");
      double arrear=sc.nextDouble();
      if(units>0&&units<=50)
amount=units*1.20;
      else if(units>50&&units<=100)
    	  amount=50*1.20+(units-50)*2.40;
      else if(units>100&&units<=150)
    	  amount=50*1.20+50*2.40+(units-50)*3.60;
      else if(units>150){
    	  amount=50*1.20+50*2.40+50*3.60+(units-50)*4.80;
    	  if(units>200)
    	discount=amount*(5.0/100.0);
    	  if(discount>200)
    		  discount=200.0;
      }
      
    	if(arrear>0)
    		fineamount=arrear*(10.0/100.0);
    	System.out.println(fineamount+" "+discount);
    	totalamount=amount+arrear+fineamount-discount;
    	System.out.println("totalamountpay="+totalamount);
    		  
      }
      
	}


