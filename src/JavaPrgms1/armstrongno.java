package JavaPrgms1;

import java.util.Scanner;

public class armstrongno
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no:");
	int no = sc.nextInt();
	int rem,mul,armno=0,t;
	t=no;;
	while(t!=0)
	{
		rem=t%10;
		mul=rem*rem*rem;
		armno=armno+mul;
		t=t/10;
	}
	if(no==armno)
	{
		System.out.println("It is a armstrong no");
		System.out.println("Its armstrong no");
	}
	else
	{
		System.out.println("It is not a armstrong no");
	}
}
}
