package learnJava;

public class EnhancedLoop 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		int b[]= {5,4,8,6,9,4};
		int c[]= {2,5,4,8};
		
		int d[][]= {
				{1,2,3},
				{5,4,8,6,9,4},
				{2,5,4,8}
				 };
		
		for(int k[]:d)
		{
			for(int l: k)
			{
				System.out.print(l+ " ");
			}
			System.out.println();
		}
		
	}

}
