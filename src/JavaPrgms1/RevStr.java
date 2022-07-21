package JavaPrgms1;

public class RevStr
{
public static void main(String[] args) 
{
	//sum of even no:
	
	System.out.println("sum of even=");
	for(int i=0;i<=10;i++)
	{
		int sume=0;
		if(i%2==0)
		{
		sume=sume+i;
		}
		System.out.print(sume);
	}
	System.out.println("sum of odd=");
	for(int j=0;j<=10;j++)
	{
		int sumo=0;
		if(j%2!=0)
		{
		sumo=sumo+j;
		}
		System.out.println();
		System.out.println(sumo);
	}
	/*
	//even & odd nos
	System.out.println("Even nums are: ");
	for(int i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.print(i);
		}
	}
	System.out.println();
	System.out.println("Odd nums are: ");
		for(int j=0;j<=10;j++)
		{
			if(j%2!=0)
			{
				System.out.print(j);
			}
		}
	
	 //rev str
	String s="Suhana";
	String rev="";
	for(int i=s.length();i>0;i--)
	{
		char c=s.charAt(i-1);
		rev=rev+c;
	}
	System.out.println(rev);
	/rev no
	int n=56789;
	int rev=0,rem;
	while(n!=0)
	{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	System.out.println(rev);
	
	
	//sum
	int n=5421;
	int sum=0,rem;
	while(n!=0)
	{
	rem=n%10;
	sum=sum+rem;
	n=n/10;
    }
	System.out.println(sum);*/
	
	
}
}
