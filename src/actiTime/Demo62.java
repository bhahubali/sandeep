package actiTime;
class Animal{
	void speak()
	{
		System.out.println("animal speaking ");
	}
	
}
class mammal extends Animal
{
	
	void speak1()
	{
		System.out.println("mammal speaking ");
	}
	
}
class dog extends mammal{
	void speak2()
	{
		System.out.println("dog speaking ");
	}
	
}
public class Demo62 {

	public static void main(String[] args) {
		dog d=new dog();
		d.speak1();
		d.speak2();
		d.speak();
		System.out.println("---------------");
		mammal m=new mammal();
		m.speak1();
		m.speak();
		System.out.println("---------------");
		Animal a1=new Animal();
		a1.speak();
		
		
	}

}
