package JavaPrgms1;

import java.util.Scanner;

public class Palindromeno
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no:");
	int no = sc.nextInt();
	int rem,mul,rev=0,t;
	t=no;;
	while(t!=0)
	{
		rem=t%10;
		rev=rev*10+rem;
		t=t/10;
	}
	if(no==rev)
	{
		System.out.println("It is a palindrome no");
	}
	else
	{
		System.out.println("It is not a palindrome no");
	}
	System.out.println("program completed");
	System.out.println("Now divya is going to do coding");
	System.out.println("Next day soni is going to do code");
	System.out.println("next day divya code");
	System.out.println("3rd day sonys code");
	System.out.println("3rd day of divyas code");
	System.out.println("4th day of divyas");
	}
}
