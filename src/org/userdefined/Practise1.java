package org.userdefined;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Practise1 
{
public static void main(String[] args) 
{
	Sample1 s=new Sample1();
	s.setId(101);
	s.setName("Ravi");
	System.out.println(s.getId()+s.getName());
	Sample1 s1=new Sample1();
	s1.setId(102);
	s1.setName("Bala");
	System.out.println(s1.getId()+s1.getName());
	
	System.out.println("=====================");
	//List:
	List<Sample1> li=new ArrayList<Sample1>();
	li.add(s);
	li.add(s1);
	for(int i=0;i<li.size();i++)
	{
		Sample1 sample1 = li.get(i);
	System.out.println(sample1.getId());
	System.out.println(sample1.getName());
	//System.out.println(li.get(i).getName());	
	}
	System.out.println("=====================");
	/*//Set:
		Set<Sample1> se=new HashSet<Sample1>();
		se.add(s);
		se.add(s1);
		for(Sample1 fe:se)
		{
		System.out.println(fe.getId());
		System.out.println(fe.getName());	
		}
		System.out.println("=====================");	
		//Map:
		Map<Integer,Sample1> ma=new TreeMap<Integer,Sample1>();
		ma.put(1,s);
		ma.put(2,s1);
		Set<Entry<Integer,Sample1>> entrySet=ma.entrySet();
		for(Entry<Integer,Sample1> f:entrySet)
		{
			System.out.println(f.getKey());
			System.out.println(f.getValue().getId());
			System.out.println(f.getValue().getName());
		} */
}
}
