import java.util.Scanner;
public class HollowSquare {
	public static void square(int s){
	    int count=s;
	    for(int i=0;i<s;i++){
	        if(i==0){
	            count=s;
	            while(count-->0)System.out.print("* ");
	        }
	        else if(i==s-1){
	            count=s;
	            while(count-->0)System.out.print("* ");
	        }
	        else{
	            count=2*s-3;
	            System.out.print("*");
	            while(count-->0)System.out.print(" ");
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	  
    public static void main(String[] args){
	        Scanner scn = new Scanner(System.in);
	        int t = scn.nextInt();
	        while(t-- > 0) {
	            int s = scn.nextInt();
	            square(s);
	        }
	        scn.close();
	    }
	}
	
