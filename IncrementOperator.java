public class arithmeticTricks {
	public static void main(String[] args) {
		int m=5;
		int n=7;
		
		//n+=m; equivalent to n=n+m
		//n++; //n+=1; n=n+1;
		//Similarly we have decrement operator i.e. n--
		// n++; post increment
		// ++n; pre increment
		m=n++;
		System.out.println(m);
		System.out.println(n);
	}

}
