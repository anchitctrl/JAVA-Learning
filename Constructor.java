package learnJava;

class A
{
	int i;
	float j;
	
	
	public A()
	{
		System.out.println("Hii");
	}
	
	public A(int k)
	{
		System.out.println("Hello");
	}
	
	public A(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class ConstructorJava {
	public static void main(String[] args)
	{
		
		//Constructor is a member method with same name as Class, used to allocate the memory to the object
		//how much memory occupies by an Object defines by Constructor
		//three things about constructor
//		1. always ends with (), that means it is a method
//		2. same name as class
//		3. never returns anything, so always starts with public
		
		//even if you don't defines a constructor it will always be there in your class.
		
		//also we can provide the initialize values to the variables using the constructor
		//we don't need to call the constructor, as soon as we create an object constructor will be automatically called
		
		//Constructor Overloading: having multiple constructor with different parameters in the same class 
		
		A obj= new A(6,4);
		
		
		
	}

}
