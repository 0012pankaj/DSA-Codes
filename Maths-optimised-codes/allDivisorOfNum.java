public class allDivisorOfNum {
    static void giveAllDiviser1(int n) {
        int i=1;
        for (i = 1; i * i <= n; i++) 
            if (n % i == 0)
                System.out.print(i + " ");                                                  //TC-->Theta(root(n))

            for (; i >= 1; i--)
                if (n % i == 0)
                    System.out.print(n / i + " ");
        
        System.out.println();
    }
    // 	/////////// FOR SHORT ORDER (printDivisors)
	// static void printDivisors(int n)
	// {
	// 	for(int i=1; i*i <= n; i++)
	// 	{
	// 		if(n % i == 0)
	// 		{
	// 			System.out.print(i+" ");

	// 			if(i != n / i)
	// 				System.out.print((n / i)+" ");					
	// 		}
	// 	}
	// }

    public static void main(String[] args) {
        int n = 15;
        giveAllDiviser1(n);

        // printDivisors(n);
    }
}
