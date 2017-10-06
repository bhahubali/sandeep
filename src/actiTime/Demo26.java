package actiTime;

public class Demo26 {

	public static void main(String[] args) {

		int tot=add(10,20);
		System.out.println(tot);
		System.out.println("----");
		System.out.println(add(11,22));
		System.out.println("----");
		System.out.println(add(add(20,30),add(5,10)));
		print();
		String s=getval("i love");
		System.out.println(s);
		System.out.println(getval("i love"));
	}
	static int add(int n1,int n2){
		int total=n1+n2;
		return total;
	}
	static String getval(String str){
		str=str+"java";
		return str;
		
	}
		static void print(){
			System.out.println("i love java");
		
		
		}

	}


