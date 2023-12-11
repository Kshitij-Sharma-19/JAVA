import java.util.Scanner;
public class SquareWall {

	public static void squareWall(int s){
	    
	    //Write your code here
	    int i=1;
	    while(i<=s){
	        int j=1;
	        while(j<=s){
	            System.out.print("* ");
	            j++;
	        }
	        i++;
	        System.out.println();
	    }
	    
	}


	public static void main(String[] args){
	        Scanner scn = new Scanner(System.in);
	        int t = scn.nextInt();
	        while(t-- > 0) {
	            int s = scn.nextInt();
	            squareWall(s);
	        }
	        scn.close();
	    }
	}

