package org.userdefined;

import java.util.ArrayList;
import java.util.List;

public class Emp2 
{
public static void main(String[] args) 
{
	Emp1 em1=new Emp1();
	em1.setName("ravi");
	em1.setAge(22);
	em1.setSal(10000);

	Emp1 em2=new Emp1();
	em2.setName("rahul");
	em2.setAge(30);
	em2.setSal(15000);
	
	Emp1 em3=new Emp1();
	em3.setName("raj");
	em3.setAge(40);
	em3.setSal(25000);
	
	Emp1 em4=new Emp1();
	em4.setName("sheetal");
	em4.setAge(24);
	em4.setSal(46000);
	
	Emp1 em5=new Emp1();
	em5.setName("suhana");
	em5.setAge(35);
	em5.setSal(50000);
	
	List<Emp1> li=new ArrayList<Emp1>();
	li.add(em1);
	li.add(em2);
	li.add(em3);
	li.add(em4);
	li.add(em5);
	System.out.println("Hike sal for Emp age>25 is :");
	System.out.println("==============================");
	int oldsal=0,hike=0,presentsal=0;
	String employeename;
	for(int i=0;i<li.size();i++)
	{
	Emp1 test = li.get(i);
	int age = test.getAge();
		if(age>25)
		{
			employeename = test.getName();
			oldsal = test.getSal();
			hike=(oldsal*10)/100;
		presentsal=oldsal+hike;
		System.out.println("Name is:"+employeename);
		System.out.println("Age is: "+age);
		System.out.println("old salary is :"+oldsal);
		System.out.println("hike is: "+hike);
		System.out.println("Present salary is :"+presentsal);
		System.out.println("==============================");
		}
		else
		{
			employeename = test.getName();
			oldsal = test.getSal();
			hike=(oldsal*0)/100;
		presentsal=oldsal+hike;
		System.out.println("Name is:"+employeename);
		System.out.println("Age is: "+age);
		System.out.println("old salary is :"+oldsal);
		System.out.println("hike is: "+hike);
		System.out.println("Present salary is :"+presentsal);
		System.out.println("==============================");
		}
	}
	
}
}
