package learnJava;

public class BreaknContinue {
	public static void main(String[] args) {
		
		
		for(int i=1;  i<=10; i++)
		{
			
			if(i==7)
			{
				// break; //kick out of the for loop
				continue; // skip one step when i=7
			}
			System.out.println("value is "+ i);
		}
	}

}
