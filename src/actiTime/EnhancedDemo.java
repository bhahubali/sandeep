package actiTime;

public class EnhancedDemo {

	public static void main(String[] args) {
		int arr[]={60,70,80,90};
		for( int i=0;i<=3;i++)
			System.out.println(arr[i]);
System.out.println("============");
for( int i: arr)
	System.out.println(i);
String  str[]={"hello","hai","bye","hmm"};
for( int i=0;i<=3;i++)
	System.out.println(str[i]);
System.out.println("============");
for( String s: str)
	System.out.println(s);
float temp[]={32.0f,42.0f,52.0f,62.0f};

for( int i=0;i<=3;i++)
	System.out.println(temp[i]);
for( float  t: temp)
	System.out.println(t);
	}

}
