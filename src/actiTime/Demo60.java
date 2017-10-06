package actiTime;

class A{
	int i;
	A(int i)
	{
		this.i=i;
	}
	A()
	{
		i=123;
	}
	A(String s)
	{
		System.out.println(s);
	}
	
}
class B extends A{
	B(int a)
	{
		super(a);
	}
	B()
	{
		super();
		
	}

B(int a, int b,String s1,String s2, char ch){
	super(a);
	
}

}


public class Demo60 {

	public static void main(String[] args) {
	
		A a1=new A(100);
		new A();
		A a2=new A();
		System.out.println("-----");
		B b1=new B(200);
		B b2=new B();
		B b3=new B(100,200,"super","star",'A');
		
		
	}

}
