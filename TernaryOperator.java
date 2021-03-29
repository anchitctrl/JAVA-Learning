package learnJava;

public class ternarySwitch {
	public static void main(String[] args) {
		
		int n=8;
		int m=3;
		
//		if(n>5) {
//			m=1;
//		}
//		else {
//			m=4;
//		}
		
		//we use ternary operator to reduce above 4 lines of code
		
		//ternary operator ?:
		
		//condition?exp1:exp2
		//exp1 will be executed if condition is true, or exp 2 will be executed if condition is false
		
		m= n>5?1:4;
		
	System.out.println(m);
	}

}
