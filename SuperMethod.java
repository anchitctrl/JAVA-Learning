package learnJava;

//if you won't use super method, while calling an object B(5); it will 
//call B(int i ) constructor from sub class but default constructor 
//from super class

//super() is always there, even if we are not using it

class A1
{
	public A1()
	{
		System.out.println("in A");
	}
	public A1(int i)
	{
		System.out.println("in A int");
	}
}

class B1 extends A1
{
	public B1()
	{
		System.out.println("in B");
	}
	public B1(int i)
	{
		super(i); //using super (i) will call the parameterize constructor from super class A
		System.out.println("in B int");
	}
}

public class SuperMethod 
{

	public static void main(String[] args) 
	{
		B1 obj=new B1(5);
		
		
	}

}
