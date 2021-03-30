package learnJava;

//Wrapping or Boxing
//Integer is the class name for int.
//primitive works faster than Wrapper Class
//There are some Frameworks which works only with Wrapper class(that's the application of it)


public class WrapperClass {

	public static void main(String[] args) 
	{
		int i=5; //primitive datatype, as java is all about Objects, we will create classes to use int
	
		Integer ii= new Integer(5); //This Integer here is called as Wrapper Class
		//Boxing, Wrapping
		//both i and ii have values 5, but in a different manner
		
		Float f=new Float(3.2);
		int j=ii.intValue();  //Unboxing, Unwrapping
		System.out.println(j);
		System.out.println(f);
		
		Integer value=10; //Autoboxing,instead of saying new Integer
		//When we put the value by own is known as Boxing but when Java do it for us is known as AutoBoxing
		
		int k=value; //Auto-Unboxing
		System.out.println(value);
		
		
		
		String str="123";
		int n=Integer.parseInt(str); //We need to use method Integer because parseInt is static
		System.out.println(n);
	}

}
