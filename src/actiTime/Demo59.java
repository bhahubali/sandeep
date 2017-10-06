package actiTime;

class C{
	
	int i,j;
	C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void print()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
	
}
class D extends C
{
	int a,b;
	
   D(int a,int b)
   {
	  super(110,200);
	   this.a=a;
	   this.b=b;
	   
   }
   
   void disp()
   {
	   System.out.println("a="+a);
	   System.out.println("b="+b);
   }
}
class E extends D
{
   E() 
   {
	
	super(555,666);
	
}	
E(int x,int y)
{
super(x,y);	
}

}

public class Demo59 {

	public static void main(String[] args) {
	
   C c1= new  C(100,200);
 /* System.out.println(c1.i);
  System.out.println(c1.j);*/
  c1.print();
  System.out.println("-----------------");
  D d1=new D(111,222);
  d1.disp();
  d1.print();
  System.out.println("------------");
  
   E e1= new E();
   e1.disp();
   e1.print();
   System.out.println("--------");
   E e2=new E(777,888);
   e2.disp();
   e2.print();
   
   
  
  
   
	}

}
