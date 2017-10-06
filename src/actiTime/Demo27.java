package actiTime;

public class Demo27 {

	public static void main(String[] args) {
	wish();
	greet();
	int sum=add(100,200);
	System.out.println(sum);
	System.out.println(add(500,500));
	add(500,600);
	System.out.println(add(add(123,456),add(111,222)));
System.out.println(greet1("sandeep"));
String str=greet1("hai");
System.out.println(str);
	}
	static String greet1(String name){
		return "hello"+name;
		
	}
	static void wish(){
		System.out.println("hii good morning");
	}
	static void greet(){
		System.out.println("happy new year");
		
	}
	static int add(int n1,int n2){
		int total=n1+n2;
		return total;
	}
	}


