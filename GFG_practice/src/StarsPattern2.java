// 12Th OCtober 2023
import java.util.Scanner;
public class StarsPattern2 {
	//Pyramid Pattern
	public static void star(int n) {
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=(n-i)) {
				System.out.print(" ");
				j++;
			}
			int k =1;
			while(k<=(2*i-1)) {
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Intput the test cases:");
	    int t = scan.nextInt();
	    while(t-->0) {
	    	System.out.println("How many lines of star pattern is required:");
	    	int n = scan.nextInt();
	    	star(n);
	    }
	    scan.close();
	

	}

}
