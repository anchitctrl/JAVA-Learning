package learnJava;

public class whilenFor {
	public static void main(String[] args) {
		
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		
		//repeating code is called as code redundancy (which is a crime)
		//now we can repeat a code multiple times using looping statements
		//looping statements like while, do while,for, for-each

//while loop		
		int i=54;  //initialization
		while(i<6) //condition
		{
		System.out.println("while statement");
		i++;  //increment
		}
	
		
//do while (taking the input from the user)
		
		int j=54; //initialization  
		do   //output will execute atleast once,even if condition is wrong
		{
			System.out.println("do while ");
			j++; //increment
		}while(j<=5);  //condition
	
		
//for loop (all the three steps in one line)
		
		for(int a=1; a<=5;a++) {
			System.out.println("Forloop");
		}
	}//for each will be discussed after Arrays

}
