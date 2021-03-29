package learnJava;


//1. class
//	a. variables  //define variables
//	b. method    //operations
//2. object   // a way to access the class
//	a. assign the values to the variables
//	b. call the method
//	c. Print the results
	



class Calc                //making class
{
	
	//object knows something means these data
	int n1;         
	int n2;
	int result;          
	
	
	//object does something with the help of methods
	//let's create a method here
	public void perform()        //public=access modifier and void=return type and method name is perform
	{
		result=n1+n2;
	}
	
}

public class ClassnObject {
	public static void main(String[]args) 
	{
		//this main method is the first which gets executed when we run the code
		
		
		//class:object::blueprint:building
		//class defines the structure of an object
	
		Calc obj= new Calc();   //taking obj is reference
								//making object where Calc() is constructor
								//knows something and does something
		
		obj.n1=4;
		obj.n2=5;
		
		obj.perform();  //calling the method
		System.out.println(obj.result);
	
	
	}
	

}
