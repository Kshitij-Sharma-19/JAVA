//12Th OCtober 2023
import java.util.Scanner;
public class nthFibonacciNum {
  
  
//} Driver Code Ends
//User function Template for Java

public static int fibonacci(int n){
	   int t1 = 0;
	   int t2 = 1;
	   int t  = t1+ t2;
	   int i = 2;
	   while(i < n){
	       t1 = t2;
	       t2 = t;
	       t = t1+t2;
	       i++;
	   }
	   return t;
}

//{ Driver Code Starts.

  public static void main(String[] args)
  {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      while(t-- > 0) {
          int n = scn.nextInt();
          int ans = fibonacci(n);
          System.out.println(ans);
      }
      scn.close();
  }
}
//} Driver Code Ends