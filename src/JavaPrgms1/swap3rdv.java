package JavaPrgms1;

public class swap3rdv 
{
	public static void main(String[] args) 
	{
		//with 3rd var
		int a=10,b=20,c;
		c=a;
		a=b;
		b=c;
System.out.println("a="+a);
System.out.println("b="+b);
//without 3rd var:
int x=10,y=20;
x=x+y;
y=x-y;
x=x-y;
System.out.println("x="+x);
System.out.println("y="+y);
	}	
}
