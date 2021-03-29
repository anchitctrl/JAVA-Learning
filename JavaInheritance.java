package learnJava;

//JAVA doesn't support multiple inheritance
//This class will have only one method
//super, parent, base
class Calculator
{
	public int add(int ...i)
	{
		int sum=0;
		for(int k:i)
		{
			sum=sum+k;
		}
		return sum;
	}
}

//single level inheritance
//This class will have two methods(sub and add)
//sub, child, derived
class CalAdv extends Calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}

//multi level inheritance (create on more class)
class CalMulti extends CalAdv
{
	public int Mul(int ...i)
	{
		int mul=1;
		for(int k:i)
		{
			mul=mul*k;
		}
		return mul;
		
	}
}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		CalMulti c1=new CalMulti();
		
		System.out.println(c1.Mul(4,5,6));
		System.out.println(c1.sub(4,5));
		System.out.println(c1.add(4,5,8,9));
		

	}

}
