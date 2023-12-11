import java.util.Scanner;

public class InvertedRightAngleTriangle {

	public static void invTriangleWall(int s){
	    
	    //Write your code here
	    for(int i=1; i<=s; i++){
	        for(int j=i; j<=s; j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("No of Inputs: ");
		int t =scan.nextInt();
		System.out.println("How many lines of Inverted Triangle :");
		while(t-->0) {
			int s = scan.nextInt();
			invTriangleWall(s);
		}
		scan.close();
	}

}
