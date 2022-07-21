package JavaPrgms1;

import java.util.Scanner;

public class ReverseString 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String name= sc.nextLine();
	int len=name.length();
	String rev="";
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);	
	}
	System.out.println("Reverse of a String is: "+rev);
}
}