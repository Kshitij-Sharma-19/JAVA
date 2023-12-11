//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class HollowTriangle {
    
    
// } Driver Code Ends
//User function Template for Java

public static void triangle(int s){
        
    //Write your code here
   for(int i=1; i<=s; i++){//parent for loop lterate s
   for(int j=1; j<=i; j++){
  
  if(j==1 || j==i || i==s){
     System.out.print("*");  //print star, when the condiiton is true
     }
     else{
     System.out.print(" ");
   }
   }
  System.out.println();//move to next line
}
        
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            triangle(s);
        }
        scn.close();
    }
}
// } Driver Code Ends