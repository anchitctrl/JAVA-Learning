package learnJava;

//parent, super class
class A2
{
	public void show()
	{
		System.out.println("in A2");
	}
}

//Child, sub class
class B2 extends A2
{
	public void show()
	{
		System.out.println("in B2");
	}
	public void config()
	{
		System.out.println("Config it is");
	}
}

class C2 extends A2
{
	public void show()
	{
		System.out.println("in C2");
	}

}
public class DynamicMethod 
{
//compile time and runtime
	
	public static void main(String[] args) 
	{
		A2 obj=new B2(); //this linking will be done at run time, which show method will be called will be decided at run time.(run time polymorphism)
		//reference is from A2
		//but the object which we are calling is from B2
		//reference from superclass and object from sub class is possible
		obj.show();
//		obj.config(); we can't use this because A2 don't know anything about config method
		//if we are using reference from super and object from sub we can call only those methods which are there in reference that is A2 here
	
		obj=new C2(); //using the same reference of A2 and object from C2
		obj.show();  //calling show from the object of C2
		
		//every time we are changing the methods is known as dynamic Method Dispatch
	
	}
	

}
