package org.stvariables;

public class B 
{
private void m1()
{
	
	System.out.println("m1");
}
private void m2()
{
	m1();
	System.out.println("m2");
}
public static void main(String[] args) 
{
	B ob=new B();
	ob.m2();
}
}
