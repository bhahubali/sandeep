package actiTime;
class Banna{
	
	}
public class Demo19 {

	static Banna  b1;
	static String s1;
	
	
	public static void main(String[] args) {
	System.out.println(b1);
	//System.out.println(b1 instance of Banna);
	
     b1=new Banna();
     System.out.println(b1);
     //System.out.println(b1 instance of Banna  );
     System.out.println("-----");
     System.out.println(s1);
   //  System.out.println(s1 instance of String );
     s1=new String("hello");
     System.out.println(s1);
	}

}
