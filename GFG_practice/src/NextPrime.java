//{ Driver Code Starts
//Initial Template for Java
// 12Th OCtober 2023

import java.util.Scanner;
import java.lang.Math;
public class NextPrime {

    
// } Driver Code Ends
//User function Template for Java
	public static int nextPrime(int n) {

	    boolean isPrime;
	    n++;
	    while (true) {
	        int sqrt = (int) Math.sqrt(n);
	        isPrime = true;
	        for (int i = 2; i <= sqrt; i++) {
	            if (n % i == 0) isPrime = false;
	        }
	        if (isPrime)
	            return n;
	        else {
	            n++;
	        }
	    }


	}
    //code here to find next prime number
    //return next prime number


//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = nextPrime(n);
            System.out.println(ans);
        }
        scn.close();
    }
}
// } Driver Code Ends