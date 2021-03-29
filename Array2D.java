package learnJava;

public class Array2D 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7};
		int c[]= {8, 9,10,11,12,13};
		int d[]= {14,15,16};
		
		int X[][]= {
//				{1,2,3,4},                  //Jagged Arrays
//				{5,6,7},
//				{8,9,10,11,12,13},
//				{14,15,16}
				a,b,c,d
				};
		
		for(int i=0;i<X.length;i++)
		{
			for(int j=0;j<X[i].length;j++)
			{
				System.out.print(X[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
