package actiTime;

public class Demo61 {

	void print(){
		System.out.println("print() method no arguments");
	}
	
	String print(int i)
	{
		/*System.out.println( "print() method with one arg");*/
	return "sucess";
	
	}
	String print(int i,int j)
	{
		
		/*System.out.println( "print() method with two arg");*/
		return "sucess1";
		
	}
	
	String print(long n ,long m)
	{
		
	/*	System.out.println( "print() method with two  long arg");*/
		return "sucess2";
		
	}
	

	String print(String s,int i)
	{
		
		/*System.out.println( "print() method with two  long arg");*/
		return "sucess3";
		
	}
	
	String print(int i,String s)
	{
		
		/*System.out.println( "print() method with two  long arg");*/
		return "sucess4";
		
	}
	
	public static void main(String[] args) {
		
		String res;
		Demo61 d=new Demo61();
		d.print();
		res=d.print(555);
		System.out.println(res);
		res=d.print(123,426);
		System.out.println(res);
		res=d.print(100l,200l);
		System.out.println(res);
		res=d.print("star",200);
		System.out.println(res);
		res=d.print(1000,"super");
		System.out.println(res);
		
		
		
		
		
		
		
		
		
	}

}
