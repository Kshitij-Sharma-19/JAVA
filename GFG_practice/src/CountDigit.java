import java.util.Scanner;
public class CountDigit {

	public static void countDigit(int n) {
		int count = 0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.print(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		int n =sc.nextInt();
		countDigit(n);
		System.out.println();
	    }
		sc.close();
	}

}
