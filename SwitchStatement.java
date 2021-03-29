package learnJava;

public class switchStatement {
	public static void main(String[] args) {
		
		int n=6; //int and char can be used in String
		//switch doesn't support double
		//Only java 1.7 and later versions supports String
		
		
		switch(n)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
		System.out.println("Nothing");
		}
	}

}
