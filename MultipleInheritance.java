//package learnJava;
//
//Java doesn't support Multiple Inheritance, Let's see Why?
//Let's say Class C extends A, B; and when we call a method (say show) it will get confuse from where should we call that method(that is from A or from B) 
//For example
//
//class A
//{
//	public int show()
//	{
//		return;
//	}
//	
//}
//
//class B
//{
//	public int show()
//	{
//		return;
//	}
//}
//
//class C extends A,B
//{
//	
//}
//
//public class MultipleInheritance 
//{
//
//	public static void main(String[] args) 
//	{
//		C obj=new C();
//		obj.show;
		//At this moment a confusion will occur which is know as Ambiguity.
//	}
//
//}



//How to resolve this Issue of Ambiguity is to not use Multiple Inheritance
//that's why Java Doesn't support Multiple Inheritance







