package learnJava;

class Demo
{
	public int add(int ... i  ) //variable length argument
	{
		int sum=0;
		for(int k: i)
		{
			sum=sum+k;
		}
		return sum; 
	}
}


public class VarArgs 
{
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		
		System.out.println(obj.add(5,7,5,55,8,5));
		
		
	}
}
