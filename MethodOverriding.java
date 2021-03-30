package learnJava;

//in this code we are calling show method
//and both the classes have same methods define in them
//So show method from class Y will be called first not from class X
//here method from child class overrides the method from parent class

class X
{
	public void show()
	{
		System.out.println("in X");
	}
}

class Y extends X
{
	@Override               //advantage of using this is instead of getting logical error we will get compile time error
	//if in case we did a spelling mistake of show method in child class, it will show us the error 
	public void show()
	{
		super.show();          //this is used if we want to call show method from parent class also
		System.out.println("in Y");
	}
}

public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		Y obj=new Y();
		obj.show();

	} 

}
