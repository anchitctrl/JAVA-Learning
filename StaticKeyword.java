package learnJava;

class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	//we can create like this also
	static                       //when we load a class
	{
		ceo="Mahesh";
		System.out.println("I am static");   //will run once because class will be called only once
	}
	
	public Emp()                //everytime when an obj calls a constructor
	{
		eid=1;
		salary=3000;
		System.out.println("I am Constructor");  //will run twice because there are two objects
	}
	
	public void show()
	{
		System.out.println(eid+ " : "+salary+ " : " + ceo);
	}
}


public class staticDemo {

	public static void main(String[] args) 
	{
		Emp rahul=new Emp();
//		rahul.eid=8;
//		rahul.salary=4000;
//		rahul.ceo="Rakesh";
//		
		Emp monu=new Emp();
//		monu.eid=9;
//		monu.salary=5000;
//		monu.ceo="Rakesh";
		
		rahul.show();
		monu.show();
		
	}

}
