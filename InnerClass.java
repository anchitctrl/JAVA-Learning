package learnJava;

//is it possible to create a class inside a class
//in this program 3 class files will be generated as there are 3 classes.
//1. Outer.class               
//2. Outer$Inner.class         //inner class(member class, static class, anonymous class)6

//3. InnerClass.class

class Outer
{
	int a;  //variable
	//static int a; we can have a static variable
	
	public void show()  //method
	//public static void show() (we can have a static method)
	{
		
	}
	
	class Inner  //inner class (class inside a class)
	//static class Inner (we can have a static class)
	{
		public void display()  //method of the inner class
		{
			System.out.println("i am inner class method");
		}
	}
}


public class InnerClass 
{
	
	
	
	public static void main(String[] args)
	{	
		
		Outer obj=new Outer();
		obj.show();
		
		//now to call inner class we need to create an object for it
		
		Outer.Inner obj1= obj.new Inner();  //using obj.new to access anything inside the class
		//in case we have a static inner class we need to define the constructor like this
		//Outer.Inner obj1= obj.new Object.Inner();
		obj1.display();
		
	}

}
